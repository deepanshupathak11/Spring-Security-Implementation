package com.codegym.SpringSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("")
    public String greet(HttpServletRequest request){
        return "How you doing..." + request.getSession().getId();
    }
}
