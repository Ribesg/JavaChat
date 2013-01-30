/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */

public class ConnectResponse extends AbstractResponse {

	public ConnectResponse(long sessId, long sequenceNumber, RespStatus status) {
		super(RespType.CONNECT, sessId, sequenceNumber, status);
	}

}
