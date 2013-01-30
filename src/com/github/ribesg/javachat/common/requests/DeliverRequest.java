/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */

public class DeliverRequest extends AbstractRequest {

    public DeliverRequest(final long sessId, final long sequenceNumber, final String message, final long currentTime, final long messId) {
        super(ReqType.DELIVER, sessId, sequenceNumber);
        parameters[0] = message;
        parameters[1] = String.valueOf(currentTime);
        parameters[2] = String.valueOf(messId);
    }

}
