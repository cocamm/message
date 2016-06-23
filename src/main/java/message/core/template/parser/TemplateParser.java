package message.core.template.parser;

import message.core.MessageContent;

public interface TemplateParser {

    public MessageContent parse(String templateName);

}
