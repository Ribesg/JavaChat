package com.github.ribesg.javachat.client;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.github.ribesg.javachat.common.requests.Request;

public class Client {

    private final String serverAddress;
    private final int    serverPort;

    private Socket       clientSocket;

    public Client(final String address, final int port) {
        serverAddress = address;
        serverPort = port;
    }

    public void send(final Request req) throws Exception {
        clientSocket = new Socket(serverAddress, serverPort);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
            writer.write(req.toString());
        }
    }
}
