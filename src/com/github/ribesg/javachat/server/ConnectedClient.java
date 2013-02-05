/**
 * 
 */
package com.github.ribesg.javachat.server;

import java.net.Socket;



/**
 * @author Tom
 *
 */
public class ConnectedClient {
	
	private String userName;
	private Socket clientSocket;
	private long sessionID;
	private long sequenceNumber;
	private long timeout;
	
	private static final long TIMEOUT = 120;
	
	ConnectedClient(Socket socket, String username, long sessionId){
		clientSocket = socket;
		userName = username;
		sessionID = sessionId;
		sequenceNumber = 0;
		timeout = TIMEOUT;
	}

	public String getUserName() {
		return userName;
	}

	public long getSessionID() {
		return sessionID;
	}
	
	public long getSequenceNumber() {
		return sequenceNumber;
	}
	
	public void setSequenceNumber(long seqNumber) {
		sequenceNumber = seqNumber;
	}
	
	public void resetTimeout() {
		timeout = TIMEOUT;
	}
	
	public boolean timeout() {
		return (--timeout == 0);
	}
	
	public long getTimeout(){
		return timeout;
	}
	
	public boolean isTimedOut(){
		return (timeout==0);
	}

	public Socket getSocket() {
		return clientSocket;
	}

	public void setSocket(Socket socket) {
		clientSocket = socket;
	}
	
}
