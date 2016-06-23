package message.service;

import message.core.Message;
import message.core.MessageSender;

public class DefaultMessageService implements MessageService {

    private MessageSender messageSender;

    public DefaultMessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(Message message) {
        messageSender.sendMessage(message);
    }
}
