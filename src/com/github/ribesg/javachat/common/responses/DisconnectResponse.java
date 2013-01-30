/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class DisconnectResponse extends AbstractResponse {

    public DisconnectResponse(final long sessId, final RespStatus state, final long sequenceNumber) {
        super(RespType.DISCONNECT, sessId, state, sequenceNumber);
    }

}
