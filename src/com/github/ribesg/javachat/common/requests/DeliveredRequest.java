/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */
public class DeliveredRequest extends AbstractRequest {

    public DeliveredRequest(final long sessId, final long messId, final long sequenceNumber) {
        super(ReqType.DELIVERED, sessId, sequenceNumber);
        parameters[0] = String.valueOf(messId);
    }

}
