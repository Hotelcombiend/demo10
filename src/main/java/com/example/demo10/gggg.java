package com.example.demo10;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class gggg {
    @RequestMapping( value = "/helloword", method = RequestMethod.GET)
    public String Helloword(){
        return "Helloword";
    }
    @RequestMapping(value = "/helloword/{name}",method = RequestMethod.GET)
    public String Helloword(@PathVariable("name") String n){
        return "Helloword " + n;
    }

}
