package com.github.ribesg.javachat.client;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.github.ribesg.javachat.common.requests.*;

public class Client {

	private String serverAddress;
	private int serverPort;

	private long seqNumber;
	private long sessId;
	
	public void setSessId(long sessId) {
		this.sessId = sessId;
	}

	private Socket clientSocket;

	public Client(String address, int port) {
		serverAddress = address;
		serverPort = port;
		seqNumber = 0;
	}
	

	private void send(Request req) throws Exception {
		clientSocket = new Socket(serverAddress, serverPort);
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
			writer.write(req.toString());
		}
	}
	
	
	
	public void sendConnect(String username, String password) throws Exception {
		send(new ConnectRequest(seqNumber++, password, username));
	}
	
	public void sendDisconnect() throws Exception {
		send(new DisconnectRequest(sessId, seqNumber++));
	}
	
	public void sendPing() throws Exception {
		send(new PingRequest(sessId, seqNumber++));
	}
	
	public void sendMessage(String message, long time) throws Exception {
		send(new SendRequest(seqNumber++, sessId, message, time));
	}
	
	public void sendView(long time) throws Exception {
		send(new ViewedRequest(seqNumber++, sessId, time));
	}
}
