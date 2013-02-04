/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

import com.github.ribesg.javachat.common.Message;

/**
 * @author ribesg, Tom
 * 
 */
public interface Request extends Message{

	public enum ReqType {
		CONNECT, DISCONNECT, SEND, DELIVER, PING, DELIVERED, VIEWED
	}

}
