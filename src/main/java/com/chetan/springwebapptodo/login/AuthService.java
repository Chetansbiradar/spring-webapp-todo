package com.chetan.springwebapptodo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("chetan") && password.equalsIgnoreCase("chet");
    }
}
