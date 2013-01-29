package com.github.ribesg.javachat.client;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.github.ribesg.javachat.common.requests.Request;

public class Client {

	private String serverAddress;
	private int serverPort;

	private Socket clientSocket;

	public Client(String address, int port) {
		serverAddress = address;
		serverPort = port;
	}

	public void send(Request req) throws Exception {
		clientSocket = new Socket(serverAddress, serverPort);
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
			writer.write(req.toString());
		}
	}
}
