/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 *
 */
public class DeliveredRequest extends AbstractRequest {

	public DeliveredRequest(long sessId, long messId, long sequenceNumber) {
		super(ReqType.DELIVERED, sessId, sequenceNumber);
		parameters[0] = String.valueOf(messId);
	}

}
