package com.spring.customer.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by YaroslaV on 18.02.2018.
 */
@Service
@Transactional
public class LoginService {

    public void login(String name, String password){
        // authorization logic
    }

}
