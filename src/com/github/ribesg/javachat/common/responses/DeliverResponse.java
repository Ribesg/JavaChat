/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class DeliverResponse extends AbstractResponse {

	public DeliverResponse(long sessId, long sequenceNumber, RespStatus state) {
		super(RespType.DELIVER, sessId, sequenceNumber, state);
	}

}
