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
	protected String[] parameters;

	public AbstractResponse(RespType type, long sessId, RespStatus state) {
		respType = type;
		sessionId = sessId;
		status = state;
		parameters = new String[]{};
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(respType);
		s.append(SEPARATOR);
		s.append(sessionId);
		for (String arg : parameters) {
			s.append(SEPARATOR);
			s.append(arg);
		}
		return s.toString();
	}
}
