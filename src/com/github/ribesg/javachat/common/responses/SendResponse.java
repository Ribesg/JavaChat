/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class SendResponse extends AbstractResponse {

	public SendResponse(long sessId, RespStatus state, long messId, long sequenceNumber) {
		super(RespType.SEND, sessId, state, sequenceNumber);
		parameters[0] = String.valueOf(messId);
	}

}
