package pl.as.formularz_konktaktowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;
    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String replyTo, String content) {

        SimpleMailMessage mail = new SimpleMailMessage();
        String sender = "rbzf@mail.com";
        mail.setFrom(sender);
        String receiver = "rbzf@mail.com";
        mail.setTo(receiver);
        mail.setReplyTo(replyTo);
        String subject = "wiadomosc z formularza kontaktowego";
        mail.setSubject(subject);
        mail.setText(content);
        javaMailSender.send(mail);
    }
}
