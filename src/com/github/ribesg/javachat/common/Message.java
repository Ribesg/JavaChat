/**
 * 
 */
package com.github.ribesg.javachat.common;

/**
 * @author Tom
 * 
 */
public class Message {
    private String content;
    private long   time;
    private long   id;

    public Message(final String message, final long messageTime, final long messageID) {
        content = message;
        time = messageTime;
        id = messageID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(final long time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }
}
