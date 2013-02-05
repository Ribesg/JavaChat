/**
 * 
 */
package com.github.ribesg.javachat.server;

import java.net.Socket;
import java.util.List;

import com.github.ribesg.javachat.common.ChatMessage;

/**
 * @author Tom
 * 
 */
public class Server extends Thread {

	private boolean terminated = false;

	private ConnectedClient[] clients;
	private List<ChatMessage> messagesToSend;
	private List<ChatMessage> messagesSent;
	
	private ServerIO serverIO;

	public enum AddResult {
		OK, FULL, BAD_PASSWORD, ALREADY_CO
	};

	public Server() {
		clients = new ConnectedClient[2];
	}
	
	public void register(ServerIO serverIo){
		serverIO = serverIo;
	}

	public ConnectedClient findClient(long sessionId) {
		ConnectedClient res = null;
		if ((clients[0] != null && clients[0].getSessionID() == sessionId)) {
			res = clients[0];
		} else if ((clients[1] != null && clients[1].getSessionID() == sessionId)) {
			res = clients[1];
		}
		return res;
	}
	
	public ConnectedClient findClient(String username) {
		ConnectedClient res = null;
		if ((clients[0] != null && clients[0].getUserName() == username)) {
			res = clients[0];
		} else if ((clients[1] != null && clients[1].getUserName() == username)) {
			res = clients[1];
		}
		return res;
	}

	private ConnectedClient findRecipient(String writer) {
		ConnectedClient res = null;
		if((clients[0] != null && clients[0].getUserName() == writer)) {
			res = clients[1];
		} else {
			res = clients[0];
		}
		return res;
	}

	public String getUsername(long sessionId) {
		return findClient(sessionId).getUserName();
	}

	public void setSequenceNumber(long sessionId, long sequenceNumber) {
		findClient(sessionId).setSequenceNumber(sequenceNumber);
	}

	public AddResult addClient(Socket clientSocket, String username, String password, long sessionId)
			throws Exception {
		AddResult result;
		if (findClient(sessionId) == null) {
			if (match(username, password)) {
				if (clients[0] == null) {
					clients[0] = new ConnectedClient(clientSocket, username, sessionId);
					result = AddResult.OK;
				} else if (clients[1] == null) {
					clients[1] = new ConnectedClient(clientSocket, username, sessionId);
					result = AddResult.OK;
				} else {
					result = AddResult.FULL;
				}
			} else {
				result = AddResult.BAD_PASSWORD;
			}
		} else {
			result = AddResult.ALREADY_CO;
		}
		return result;
	}

	private boolean match(String username, String password) {
		// TODO compare user/pass with values stored in file/DB ?
		return true;
	}

	@Override
	public void run() {
		while (!terminated) {
			// we check the timeout on active clients
			if (clients[0] != null && clients[0].timeout())
				clients[0] = null;
			if (clients[1] != null && clients[1].timeout())
				clients[1] = null;

			if (!messagesToSend.isEmpty()) {
				for (ChatMessage mes : messagesToSend) {
					ConnectedClient client = findRecipient(mes.getWriter());
					if(client != null) {
						try {
							serverIO.sendDeliver(client.getSocket(), client.getSessionID(), client.getSequenceNumber(), mes);
							messagesSent.add(mes);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
					}
				}
				messagesToSend.clear();
			}

			try { // TODO : change this to schedule machintruc
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean ping(long sessionId) {
		boolean res = false;
		ConnectedClient client;
		client = findClient(sessionId);
		if (client != null) {
			client.resetTimeout();
			res = true;
		}
		return res;
	}

	public void addToMessageList(ChatMessage mess) {
		messagesToSend.add(mess);
	}

	public void removeFromSentList(ChatMessage mes) {
		messagesSent.remove(mes);
	}

}
