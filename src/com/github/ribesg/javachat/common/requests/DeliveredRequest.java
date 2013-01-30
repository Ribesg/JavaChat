/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 *
 */
public class DeliveredRequest extends AbstractRequest {

	public DeliveredRequest(long sessId, long sequenceNumber, long messId) {
		super(ReqType.DELIVERED, sessId, sequenceNumber);
		parameters = new String[1];
		parameters[0] = String.valueOf(messId);
	}

}
