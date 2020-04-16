package sblucenedemo.karl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sblucenedemo.karl.service.dbbase.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("getResult")
    public void getResutl() {
        int result = service.testSelect();
        System.out.println("select result:" + result);
    }

}