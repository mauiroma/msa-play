package it.mauiroma.msa.sb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {
    
    @RequestMapping("/greetings")
    public String greetings() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/hello")
    public String helloWorld(@RequestParam(defaultValue = "world") String name) {
        return "Hello "+name;
    }


    @RequestMapping("/hello/{name}")
    public String getFooById(@PathVariable String name) {
        return "NAME: " + name;
    }

}
