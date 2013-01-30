/**
 * 
 */
package com.github.ribesg.javachat.common.requests;


/**
 * @author Tom
 * 
 */

public class DeliverRequest extends AbstractRequest {

	public DeliverRequest( long sessId, long sequenceNumber, String message, long currentTime, long messId) {
		super(ReqType.DELIVER, sessId, sequenceNumber);
		parameters[0] = message;
		parameters[1] = String.valueOf(currentTime);
		parameters[2] = String.valueOf(messId);
	}

}
