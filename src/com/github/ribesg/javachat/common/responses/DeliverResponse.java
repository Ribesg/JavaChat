/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class DeliverResponse extends AbstractResponse {

    public DeliverResponse(final long sessId, final RespStatus state, final long messId, final long sequenceNumber) {
        super(RespType.DELIVER, sessId, state, sequenceNumber);
        parameters[0] = String.valueOf(messId);
    }

}
