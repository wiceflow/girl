package com.wiceflow.controller;

import com.wiceflow.entity.Girl;
import com.wiceflow.properties.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author BF
 * @date 2018/3/22
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlLists(){
        return girlRepository.findAll();
    }
}
