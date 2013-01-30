/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */

public class ConnectResponse extends AbstractResponse {

	public ConnectResponse(long sessId, RespStatus status, long sequenceNumber) {
		super(RespType.CONNECT, sessId, status, sequenceNumber);
	}

}
