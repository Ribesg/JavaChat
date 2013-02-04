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

	
	public ConnectRequest(long sequenceNumber, String name, String password) {
		super(ReqType.CONNECT, 0, sequenceNumber); // sessId is 0 because we're not connected
		parameters = new String[2];
		parameters[0] = name;
		parameters[1] = MD5.hash(password);
	}

}
