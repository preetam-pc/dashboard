package com.osn.dashboard.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping("/v1/api/test")
    public String init(){

        return  "Welcome to dashboard service";

    }

}
