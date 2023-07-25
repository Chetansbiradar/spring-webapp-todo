package com.chetan.springwebapptodo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("chetan") && password.equalsIgnoreCase("chet");
    }

}
