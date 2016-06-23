package message.core.template.resolver;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class RepositoryTemplateResolver implements TemplateResolver{

    public InputStream getTemplate(String templateName) {
        return new ByteArrayInputStream("Teste String ${render}".getBytes());
    }
}
