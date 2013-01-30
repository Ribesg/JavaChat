/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

import static com.github.ribesg.javachat.common.Constants.*;

/**
 * @author ribesg
 *
 */
public abstract class AbstractResponse implements Response {
	protected RespType respType;
	protected long sessionId;
	protected RespStatus status;
	protected long seqNumber;
	protected String[] parameters;

	public AbstractResponse(RespType type, long sessId, long sequenceNumber, RespStatus state) {
		respType = type;
		sessionId = sessId;
		seqNumber = sequenceNumber;
		status = state;
		parameters = null;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(respType);
		s.append(SEPARATOR);
		s.append(sessionId);
		s.append(SEPARATOR);
		s.append(seqNumber);
		s.append(SEPARATOR);
		s.append(status);
		for (String arg : parameters) {
			s.append(SEPARATOR);
			s.append(arg);
		}
		return s.toString();
	}
}
