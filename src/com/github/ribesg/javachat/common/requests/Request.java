/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author ribesg, Tom
 * 
 */
public interface Request {

	public enum ReqType {
		CONNECT, DISCONNECT, SEND, DELIVER, PING, DELIVERED, VIEWED
	}

	@Override
	public String toString();
}
