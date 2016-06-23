package message.core.template.parser;

import message.core.MessageContent;
import message.core.template.DefaultMessageContent;
import message.core.template.resolver.TemplateResolver;

import java.io.InputStream;
import java.util.Scanner;

public class VelocityTemplateParser implements TemplateParser {

    private TemplateResolver templateResolver;

    public VelocityTemplateParser(TemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    public MessageContent parse(String templateName) {
        String template = convertInputStreamToString(templateResolver.getTemplate(templateName));

        //renderiza o template

        String content = template; //template renderizado

        return new DefaultMessageContent(content);
    }


    private String convertInputStreamToString(InputStream is) {
        Scanner scanner = new Scanner(is).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
    }
}
