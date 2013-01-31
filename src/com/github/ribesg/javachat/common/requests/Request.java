/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

import com.github.ribesg.javachat.common.TcpPacket;

/**
 * @author ribesg, Tom
 * 
 */
public interface Request extends TcpPacket{

	public enum ReqType {
		CONNECT, DISCONNECT, SEND, DELIVER, PING, DELIVERED, VIEWED
	}

}
