/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 * 
 */
public class ViewedResponse extends AbstractResponse {

    public ViewedResponse(final long sessId, final RespStatus state, final long sequenceNumber) {
        super(RespType.VIEWED, sessId, state, sequenceNumber);
    }

}
