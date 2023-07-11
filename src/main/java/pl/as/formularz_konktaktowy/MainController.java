package pl.as.formularz_konktaktowy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private final EmailService emailService;

    public MainController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping(value = "/contact")
    public String send(@RequestParam String email, @RequestParam String content) {
        emailService.sendMail(email, content);
        return "success";
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
