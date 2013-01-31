/**
 * 
 */
package com.github.ribesg.javachat.server;

/**
 * @author Tom
 *
 */
public class ConnectedClient {
	
	private String userName;
	private long sessionID;
	private long sequenceNumber;
	
	ConnectedClient(String username, long sessionId){
		userName = username;
		sessionID = sessionId;
		sequenceNumber = 0;
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
	
}
