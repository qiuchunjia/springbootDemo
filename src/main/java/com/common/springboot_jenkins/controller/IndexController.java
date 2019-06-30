package com.common.springboot_jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "这是首页";
    }

    @RequestMapping("/index")
    public String indexHome() {
        return "这是/index";
    }
}
