/**
 * 
 */
package com.github.ribesg.javachat.common.responses;

/**
 * @author Tom
 *
 */
public class MessageResponse extends AbstractResponse {

	public MessageResponse(long sessId, RespStatus state) {
		super(RespType.MESSAGE, sessId, state);
	}

}
