/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DisconnectResponse extends AbstractResponse {

	public DisconnectResponse(long sessId, long sequenceNumber, RespStatus state) {
		super(RespType.DISCONNECT, sessId, sequenceNumber, state);
	}

}
