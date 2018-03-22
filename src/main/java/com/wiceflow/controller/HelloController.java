package com.wiceflow.controller;

import com.wiceflow.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BF
 * @date 2018/3/16
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("/hello")
    public String say(){
        return girlProperties.toString();
    }
}
