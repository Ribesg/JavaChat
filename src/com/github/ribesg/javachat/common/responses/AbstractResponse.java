/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

import static com.github.ribesg.javachat.common.Constants.SEPARATOR;

/**
 * @author ribesg
 * 
 */
public abstract class AbstractResponse implements Response {
    protected RespType   respType;
    protected long       sessionId;
    protected RespStatus status;
    protected long       seqNumber;
    protected String[]   parameters;

    public AbstractResponse(final RespType type, final long sessId, final RespStatus state, final long sequenceNumber) {
        respType = type;
        sessionId = sessId;
        status = state;
        seqNumber = sequenceNumber;
        parameters = new String[] {};
    }

    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder();
        s.append(respType);
        s.append(SEPARATOR);
        s.append(sessionId);
        s.append(SEPARATOR);
        s.append(seqNumber);
        s.append(SEPARATOR);
        s.append(status);
        for (final String arg : parameters) {
            s.append(SEPARATOR);
            s.append(arg);
        }
        return s.toString();
    }
}
