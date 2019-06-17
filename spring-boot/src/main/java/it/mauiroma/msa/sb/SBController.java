package it.mauiroma.msa.sb;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class SBController {
    
    /*
    @RequestMapping("/greetings")
    public String greetings() {
        return "Greetings from Spring Boot!";
    }
    */

    @RequestMapping("/greetings")
    public String greetings(@RequestHeader MultiValueMap<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
        });
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
