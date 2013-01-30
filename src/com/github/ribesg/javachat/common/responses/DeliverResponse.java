/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DeliverResponse extends AbstractResponse {

	public DeliverResponse(long sessId, RespStatus state, long messId, long sequenceNumber) {
		super(RespType.DELIVER, sessId, state, sequenceNumber);
		parameters[0] = String.valueOf(messId);
	}

}
