/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DisconnectResponse extends AbstractResponse {

	public DisconnectResponse(long sessId, RespStatus state, long sequenceNumber) {
		super(RespType.DISCONNECT, sessId, state, sequenceNumber);
	}

}
