/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class SendResponse extends AbstractResponse {

	public SendResponse(long sessId, long sequenceNumber, RespStatus state, long messId) {
		super(RespType.SEND, sessId, sequenceNumber, state);
		parameters = new String[1];
		parameters[0] = String.valueOf(messId);
	}

}
