/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class ViewedResponse extends AbstractResponse {

	public ViewedResponse(long sessId, RespStatus state, long sequenceNumber) {
		super(RespType.VIEWED, sessId, state, sequenceNumber);
		
	}

}
