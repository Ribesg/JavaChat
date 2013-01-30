/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

import static com.github.ribesg.javachat.common.Constants.SEPARATOR;

/**
 * @author ribesg
 * 
 */
public abstract class AbstractRequest implements Request {

    protected ReqType  reqType;
    protected long     sessionId;
    protected long     seqNumber;
    protected String[] parameters;

    public AbstractRequest(final ReqType type, final long sessId, final long sequenceNumber) {
        reqType = type;
        sessionId = sessId;
        seqNumber = sequenceNumber;
        parameters = new String[] {};
    }

    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder();
        s.append(reqType);
        s.append(SEPARATOR);
        s.append(sessionId);
        for (final String arg : parameters) {
            s.append(SEPARATOR);
            s.append(arg);
        }
        return s.toString();
    }
}
