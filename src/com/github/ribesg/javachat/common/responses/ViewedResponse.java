/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class ViewedResponse extends AbstractResponse {

	public ViewedResponse(long sessId, long sequenceNumber, RespStatus state) {
		super(RespType.VIEWED, sessId, sequenceNumber, state);
		
	}

}
