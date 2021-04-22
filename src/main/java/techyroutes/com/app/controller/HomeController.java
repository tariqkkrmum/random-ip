package techyroutes.com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
    @RequestMapping("/")
    String home() {
        return "Hello, World!";
    }

	@RequestMapping("/home")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
