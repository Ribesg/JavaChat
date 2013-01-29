/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author ribesg
 * 
 */
public interface Response {

	public enum RespType {
		CONNECT, DISCONNECT, HISTORY, MESSAGE, PONG, PRIVATE, INVALID,
	}

}
