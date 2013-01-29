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
	protected String[] parameters;

	public AbstractRequest(ReqType type, long sessId) {
		reqType = type;
		sessionId = sessId;
		parameters = new String[]{};
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(reqType);
		s.append(SEPARATOR);
		s.append(sessionId);
		for (String arg : parameters) {
			s.append(SEPARATOR);
			s.append(arg);
		}
		return s.toString();
	}
}
