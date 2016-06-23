package message.core.template;

import message.core.MessageContent;

public class DefaultMessageContent implements MessageContent {

    private String content;

    public DefaultMessageContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
