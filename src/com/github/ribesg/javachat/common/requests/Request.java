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
		CONNECT, DISCONNECT, HISTORY, MESSAGE, PING, PRIVATE,
	}

	@Override
	public String toString();
}
