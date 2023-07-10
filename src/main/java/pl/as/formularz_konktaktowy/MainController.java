package pl.as.formularz_konktaktowy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private final EmailService emailService;


    public MainController(EmailService emailService) {
        this.emailService = emailService;
    }
    @RequestMapping("/")
    @ResponseBody
    public void send() {
        emailService.sendMail("rbzf@byom.de", "rbzf@mail.com", "wiadomosc tesowa", "tekst wiadomosci");
    }


    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/contact")
    public String contactForm() {
        return "contact";
    }

}
