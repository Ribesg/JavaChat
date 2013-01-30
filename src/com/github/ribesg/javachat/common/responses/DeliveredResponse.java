/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DeliveredResponse extends AbstractResponse {

	public DeliveredResponse(long sessId, long sequenceNumber, RespStatus state) {
		super(RespType.DELIVERED, sessId, sequenceNumber, state);
	}

}
