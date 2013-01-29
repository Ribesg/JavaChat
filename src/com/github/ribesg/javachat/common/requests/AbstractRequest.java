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
	protected String userName;
	protected ReqType reqType;
	protected String[] content;

	public AbstractRequest(String name, ReqType type) {
		userName = name;
		reqType = type;
		content = new String[]{};
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(reqType);
		s.append(SEPARATOR);
		s.append(userName);
		for (String arg : content) {
			s.append(SEPARATOR);
			s.append(arg);
		}
		return s.toString();
	}
}
