/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */

public class ConnectResponse extends AbstractResponse {

    public ConnectResponse(final long sessId, final RespStatus status, final long sequenceNumber) {
        super(RespType.CONNECT, sessId, status, sequenceNumber);
    }

}
