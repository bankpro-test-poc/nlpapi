package com.taiwanlife.nlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NlpApiApplication {

    @GetMapping("/api/nlp")
    public String nlp() {
        return "NLP API had been called!!! prod";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(NlpApiApplication.class, args);
	}

}
