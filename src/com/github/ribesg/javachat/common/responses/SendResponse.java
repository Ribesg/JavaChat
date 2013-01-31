/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class SendResponse extends AbstractResponse {

	public SendResponse(long sessId, long sequenceNumber, RespStatus state) {
		super(RespType.SEND, sessId, sequenceNumber, state);
	}

}
