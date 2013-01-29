/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author ribesg
 * 
 */
public interface Request {

	public enum ReqType {
		CONNECT, DISCONNECT, HISTORY, SEND, PING, DELIVERED, VIEWED
	}

	@Override
	public String toString();
}
