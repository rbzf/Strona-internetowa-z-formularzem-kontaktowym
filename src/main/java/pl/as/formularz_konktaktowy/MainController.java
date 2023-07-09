package pl.as.formularz_konktaktowy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/contact")
    public String contactForm() {
        return "contact";
    }

}
