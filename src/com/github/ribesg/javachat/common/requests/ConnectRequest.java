/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

import com.github.ribesg.javachat.common.MD5;

/**
 * @author Tom
 *
 */
public class ConnectRequest extends AbstractRequest {

	
	public ConnectRequest(String name, String password, long sequenceNumber) {
		super(ReqType.CONNECT, 0, sequenceNumber); // sessId is 0 because we're not connected
		parameters[0] = name;
		parameters[1] = MD5.md5(password);
	}

}
