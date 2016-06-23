package message.core.template.resolver;

import java.io.InputStream;

public interface TemplateResolver {

    public InputStream getTemplate(String templateName);
}
