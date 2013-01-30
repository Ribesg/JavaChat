/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 *
 */
public class ViewedRequest extends AbstractRequest {

	public ViewedRequest(long sessId, long sequenceNumber, long timeOfLast) {
		super(ReqType.VIEWED, sessId, sequenceNumber);
		parameters = new String[1];
		parameters[0] = String.valueOf(timeOfLast);
		
	}

}
