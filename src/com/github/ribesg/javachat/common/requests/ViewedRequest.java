/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */
public class ViewedRequest extends AbstractRequest {

    public ViewedRequest(final long sessId, final long sequenceNumber, final long timeOfLast) {
        super(ReqType.VIEWED, sessId, sequenceNumber);
        parameters[0] = String.valueOf(timeOfLast);
    }

}
