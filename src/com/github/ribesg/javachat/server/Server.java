package com.github.ribesg.javachat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

import com.github.ribesg.javachat.common.TcpPacket;
import com.github.ribesg.javachat.common.requests.*;
import com.github.ribesg.javachat.common.requests.Request.ReqType;
import com.github.ribesg.javachat.common.responses.*;
import com.github.ribesg.javachat.common.responses.Response.RespStatus;

import static com.github.ribesg.javachat.common.Constants.*;

public class Server extends Thread {

	private boolean terminated = false;

	private final int serverPort;

	private ServerSocket serverSocket;
	private Socket clientSocket;

	private Map<Long, ConnectedClient> clients;

	public Server(final int port) {
		serverPort = port;;
	}

	@Override
	public void start() {
		try {
			serverSocket = new ServerSocket(serverPort);
		} catch (final IOException e) {
			System.out.println("Unable to start the server! Error follows:");
			e.printStackTrace();
			exit();
		}
	}

	@Override
	public void run() {
		try {
			while (!terminated) {
				clientSocket = serverSocket.accept();
				try (BufferedReader reader = new BufferedReader(
						new InputStreamReader(clientSocket.getInputStream()))) {
					final String red = reader.readLine();
					String[] parts = red.split(SEPARATOR_STRING);

					if ('R' == red.charAt(0)) {// response

					} else { // request
						ReqType type = ReqType.valueOf(parts[0]);
						long sessionId = Long.valueOf(parts[1]);
						long sequenceNumber = Long.valueOf(parts[2]);

						switch (type) {
						case CONNECT:
							if(clients.containsKey(sessionId))
							{
								// send connect resp with status already co
							} else {
								// compare password/user with that in file, register in clients map
							}
						case PING:
							sendPingResp(clientSocket, sessionId, sequenceNumber++);
							System.out.println("PING RECU");
							break;
						default:
						}

					}

					terminated = red.equalsIgnoreCase("stop");
					System.out.println(red);
				}
				clientSocket.close();
			}
		} catch (final Exception e) {
			System.out.println("Fatal Error! Error follows:");
			e.printStackTrace();
			exit();
		}
	}

	
	
	private void send(Socket client, TcpPacket packet) throws Exception {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				client.getOutputStream()))) {
			writer.write(packet.toString());
		}
	}
	
	private void sendPingResp(Socket clientSocket, final long sessionId, final long sequenceNumber) throws Exception {
		send(clientSocket, new PingResponse(sessionId, sequenceNumber, RespStatus.OK));		
	}

	public void exit() {
		if (serverSocket != null) {
			try {
				serverSocket.close();
			} catch (final IOException e) {
				// We don't care : the socket may already be closed
			}
		}
		if (clientSocket != null) {
			try {
				clientSocket.close();
			} catch (final IOException e) {
				// We don't care : the socket may already be closed
			}
		}
		terminated = true;
	}

}
