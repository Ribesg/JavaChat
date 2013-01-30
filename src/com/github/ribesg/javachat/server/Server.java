package com.github.ribesg.javachat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    private boolean      terminated = false;

    private final int    serverPort;

    private ServerSocket serverSocket;
    private Socket       clientSocket;

    public Server(final int port) {
        serverPort = port;
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
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    final String red = reader.readLine();
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
