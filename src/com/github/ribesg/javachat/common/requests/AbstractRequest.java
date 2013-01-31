/**
 * 
 */
package com.github.ribesg.javachat.common.requests;

import static com.github.ribesg.javachat.common.Constants.*;

/**
 * @author ribesg
 * 
 */
public abstract class AbstractRequest implements Request {
	
	protected ReqType reqType;
	protected long sessionId;
	protected long seqNumber;
	protected String[] parameters;

	public AbstractRequest(ReqType type, long sessId, long sequenceNumber) {
		reqType = type;
		sessionId = sessId;
		seqNumber = sequenceNumber;
		parameters = null;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(reqType);
		s.append(SEPARATOR);
		s.append(sessionId);
		s.append(SEPARATOR);
		s.append(seqNumber);
		for (String arg : parameters) {
			s.append(SEPARATOR);
			s.append(arg);
		}
		return s.toString();
	}
}
