/**
 * 
 */
package com.github.ribesg.javachat.server;

import static com.github.ribesg.javachat.common.Constants.SERVER_PORT;

/**
 * @author Ribesg
 * 
 */
public class MainServer {

    /**
     * @param args
     *            Not used for now
     */
    public static void main(final String[] args) {
        new MainServer();
    }

    public MainServer() {
        final Server server = new Server(SERVER_PORT);
        server.start();
        server.run();
    }
}
