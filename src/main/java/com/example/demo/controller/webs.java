package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/6/4.
 */
@Controller
public class webs {
    @GetMapping("/hello")
    @ResponseBody
    public String a(){
        return "hello"+"mkl3";
    }
}
