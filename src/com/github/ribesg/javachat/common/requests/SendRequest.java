/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 *
 */

public class SendRequest extends AbstractRequest {

	public SendRequest(long sessId, long sequenceNumber, String message, long currentTime) {
		super(ReqType.SEND, sessId, sequenceNumber);
		parameters = new String[2];
		parameters[0] = message;
		parameters[1] = String.valueOf(currentTime);
	}

}
