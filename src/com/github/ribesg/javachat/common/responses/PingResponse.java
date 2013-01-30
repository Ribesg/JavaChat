/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class PingResponse extends AbstractResponse {

    public PingResponse(final long sessId, final RespStatus status, final long sequenceNumber) {
        super(RespType.PONG, sessId, status, sequenceNumber);
    }

}
