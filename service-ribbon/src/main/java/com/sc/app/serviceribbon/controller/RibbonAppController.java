package com.sc.app.serviceribbon.controller;

import com.sc.app.serviceribbon.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonAppController {

    @Autowired
    AppService appService;


    @GetMapping(name = "/hi")
    public String hi(@RequestParam String name){
        return appService.hiService(name);
    }

}
