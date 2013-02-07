/**
 * 
 */
package com.github.ribesg.javachat.common;

/**
 * @author Tom
 *
 */
public class ChatMessage {
	private String content;
	private String writer;
	private long time;
	private long sequenceNumber;
	private long sessionId;
	
	public ChatMessage(String message, String writerName, long messageTime, long seqNumber, long sessionID){
		content = message;
		writer = writerName;
		time = messageTime;
		sequenceNumber = seqNumber;
		sessionId = sessionID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}
}
