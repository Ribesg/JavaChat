/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 *
 */
public class DisconnectRequest extends AbstractRequest {

	public DisconnectRequest(long sessId, long sequenceNumber) {
		super(ReqType.DISCONNECT, sessId, sequenceNumber);
	}

}
