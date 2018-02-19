package com.spring.customer.ManageApp;

import com.spring.customer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YaroslaV on 19.02.2018.
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public void login(@RequestParam ("name") String name, @RequestParam ("password")  String password){
        loginService.login(name, password);
    }
}
