/**
 * 
 */
package com.github.ribesg.javachat.client;

import static com.github.ribesg.javachat.common.Constants.SERVER_ADDRESS;
import static com.github.ribesg.javachat.common.Constants.SERVER_PORT;

import java.util.Scanner;

import com.github.ribesg.javachat.common.requests.PingRequest;

/**
 * @author Ribesg
 * 
 */
public class MainClient {

    private final Client client;
    private long         sessionId;
    private long         seqNumber;

    /**
     * @param args
     *            Not used for now
     */
    public static void main(final String[] args) {
        new MainClient();
    }

    public MainClient() {
        client = new Client(SERVER_ADDRESS, SERVER_PORT);
        final Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("exit")) {
            input = scan.nextLine();
            try {
                client.send(new PingRequest(sessionId, seqNumber));
            } catch (final Exception e) {
                e.printStackTrace();
                System.exit(42);
            }
        }
        scan.close();
    }

}
