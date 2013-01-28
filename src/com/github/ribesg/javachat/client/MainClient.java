/**
 * 
 */
package com.github.ribesg.javachat.client;

import static com.github.ribesg.javachat.common.Constants.SERVER_ADDRESS;
import static com.github.ribesg.javachat.common.Constants.SERVER_PORT;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author Ribesg
 * 
 */
public class MainClient {

    private Socket clientSocket;

    /**
     * @param args
     *            Not used for now
     */
    public static void main(final String[] args) {
        new MainClient(args);
    }

    public MainClient(final String... args) {
        try {
            for (final String s : args) {
                clientSocket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
                    writer.write(s);
                }
            }
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        //stopServer();
    }

    public void stopServer() {
        try {
            clientSocket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
                writer.write("stop");
            }
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
