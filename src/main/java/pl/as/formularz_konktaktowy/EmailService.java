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

    public void sendMail(String receiver, String sender, String subject, String text){

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(receiver);
        mail.setFrom(sender);
        mail.setSubject(subject);
        mail.setText(text);
        javaMailSender.send(mail);
    }
}
