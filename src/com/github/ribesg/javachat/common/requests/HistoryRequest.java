/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */

public class HistoryRequest extends AbstractRequest {

	public HistoryRequest(long sessId, long timeOfLast) {
		super(ReqType.HISTORY, sessId);
		parameters[0] = String.valueOf(timeOfLast);
	}

}
