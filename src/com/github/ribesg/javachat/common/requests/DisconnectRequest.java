/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

/**
 * @author Tom
 * 
 */
public class DisconnectRequest extends AbstractRequest {

    public DisconnectRequest(final long sessId, final long sequenceNumber) {
        super(ReqType.DISCONNECT, sessId, sequenceNumber);
    }

}
