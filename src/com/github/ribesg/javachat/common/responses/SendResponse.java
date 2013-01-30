/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class SendResponse extends AbstractResponse {

    public SendResponse(final long sessId, final RespStatus state, final long messId, final long sequenceNumber) {
        super(RespType.SEND, sessId, state, sequenceNumber);
        parameters[0] = String.valueOf(messId);
    }

}
