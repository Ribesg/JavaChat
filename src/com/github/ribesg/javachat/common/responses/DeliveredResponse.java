/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DeliveredResponse extends AbstractResponse {

	public DeliveredResponse(long sessId, RespStatus state, long sequenceNumber) {
		super(RespType.DELIVERED, sessId, state, sequenceNumber);
	}

}
