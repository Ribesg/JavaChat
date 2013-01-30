/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class PingResponse extends AbstractResponse {

	public PingResponse(long sessId, RespStatus status, long sequenceNumber) {
		super(RespType.PONG, sessId, status, sequenceNumber);
	}

}
