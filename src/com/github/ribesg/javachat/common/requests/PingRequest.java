/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author ribesg
 * 
 */
public class PingRequest extends AbstractRequest {

	public PingRequest(long sessId) {
		super(ReqType.PING, sessId);
	}

}
