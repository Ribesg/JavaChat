/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author ribesg
 * 
 */
public class PingRequest extends AbstractRequest {

	public PingRequest(String name) {
		super(name, ReqType.PING);
	}

}
