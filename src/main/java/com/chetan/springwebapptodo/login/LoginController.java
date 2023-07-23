package com.chetan.springwebapptodo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginPage(@RequestParam String name, ModelMap model) {
        //model gives the data to the view, model is provided by spring and its a map
        model.put("name", name);
        return "login";
    }
}
 