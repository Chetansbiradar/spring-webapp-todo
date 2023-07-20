package com.chetan.springwebapptodo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody // This annotation is required to return a String as a response
    //else it will look for a view with name "hello" and return that
    public String sayHello() {
        return "Hello";
    }
}
