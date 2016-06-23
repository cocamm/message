package message.email;

import message.core.Message;
import message.core.MessageContent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Email implements Message {

    private MessageContent messageContent;

    private String subject;

    private EmailAddress from;

    private List<EmailAddress> receivers;

    public Email(MessageContent messageContent, String subject, List<EmailAddress> receivers) {
        this.messageContent = messageContent;
        this.subject = subject;
        this.receivers = receivers;
    }

    public Email(MessageContent messageContent, String subject, String... to) {
        this(messageContent, subject, convertToEmailAddress(to));
    }

    public Email(MessageContent messageContent, String subject, EmailAddress... to) {
        this(messageContent, subject, Arrays.asList(to));
    }

    public MessageContent getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(MessageContent messageContent) {
        this.messageContent = messageContent;
    }

    private static List<EmailAddress> convertToEmailAddress(String[] to) {
        List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
        for(String address : to) {
            emailAddresses.add(new EmailAddress(address));
        }

        return emailAddresses;
    }
}
