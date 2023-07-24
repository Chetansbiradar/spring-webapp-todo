package com.chetan.springwebapptodo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/login")
    public String showLoginPage(@RequestParam Optional<String> name, ModelMap model) {
        //model gives the data to the view, model is provided by spring, and it's a map
        logger.info("Request param: name is {}", name.orElse("Guest"));
        model.put("name", name.orElse("Guest"));
        return "login";
    }
}
 