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
		CONNECT, DISCONNECT, HISTORY, MESSAGE, PONG, PRIVATE, READ
	}
	
	public enum RespStatus {
		OK,				// no error
		FAIL,			// unknown error
		INVALID_CMD,	// invalid command ID
		INVALID_SESS,	// invalid session ID
		INVALID_PASS,	// invalid password
		INVALID_ARGS,	// invalid arguments for given cmd
		ALREADY_CO,		// already connected		
	}

	@Override
	public String toString();
}
