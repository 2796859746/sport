package com.deyunjiaoyu.sport.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
