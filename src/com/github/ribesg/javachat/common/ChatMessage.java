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
	
	public ChatMessage(String message, String writerName, long messageTime){
		content = message;
		writer = writerName;
		time = messageTime;
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
}
