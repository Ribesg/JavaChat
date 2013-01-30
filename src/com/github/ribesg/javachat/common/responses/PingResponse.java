/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class PingResponse extends AbstractResponse {

	public PingResponse(long sessId, long sequenceNumber, RespStatus status) {
		super(RespType.PONG, sessId, sequenceNumber, status);
	}

}
