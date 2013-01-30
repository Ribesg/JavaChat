/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class DeliveredResponse extends AbstractResponse {

    public DeliveredResponse(final long sessId, final RespStatus state, final long sequenceNumber) {
        super(RespType.DELIVERED, sessId, state, sequenceNumber);
    }

}
