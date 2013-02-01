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
	private long timeout;
	
	private static final long TIMEOUT = 120;
	
	ConnectedClient(String username, long sessionId){
		userName = username;
		sessionID = sessionId;
		sequenceNumber = 0;
		timeout = TIMEOUT;
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
	
	public void resetTimeout() {
		timeout = TIMEOUT;
	}
	
	public boolean timeout() {
		return (--timeout == 0);
	}
	
	public long getTimeout(){
		return timeout;
	}
	
	public boolean isTimedOut(){
		return (timeout==0);
	}
	
}
