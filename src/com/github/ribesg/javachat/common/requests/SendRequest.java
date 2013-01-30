/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */

public class SendRequest extends AbstractRequest {

    public SendRequest(final long sessId, final long sequenceNumber, final String message, final long currentTime) {
        super(ReqType.SEND, sessId, sequenceNumber);
        parameters[0] = message;
        parameters[1] = String.valueOf(currentTime);
    }

}
