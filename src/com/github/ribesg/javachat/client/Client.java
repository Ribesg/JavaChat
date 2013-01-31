package com.github.ribesg.javachat.client;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.github.ribesg.javachat.common.TcpPacket;
import com.github.ribesg.javachat.common.requests.*;
import com.github.ribesg.javachat.common.responses.*;
import com.github.ribesg.javachat.common.responses.Response.*;

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

	private void send(TcpPacket packet) throws Exception {
		clientSocket = new Socket(serverAddress, serverPort);
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				clientSocket.getOutputStream()))) {
			writer.write(packet.toString());
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
		send(new ViewedRequest(sessId, seqNumber++, time));
	}

	public void sendResponse(RespType type, RespStatus state) throws Exception {
		switch (type) {
		case DELIVERED:
			send(new DeliveredResponse(sessId, seqNumber++, state));
			break;
		case DELIVER:
			send(new DeliverResponse(sessId, seqNumber++, state));
			break;
		case VIEWED:
			send(new ViewedResponse(sessId, seqNumber++, state));
			break;
		default:
			throw new Exception("Client not supposed to send such type of response : " + type.toString());
		}
			
		send(new DeliverResponse(sessId, seqNumber, state));
	}

}
