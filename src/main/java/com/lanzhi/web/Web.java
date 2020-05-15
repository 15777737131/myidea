package com.lanzhi.web;

import com.lanzhi.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {
    @Autowired
    private GitService gitService;
    @GetMapping("hello")
    public String hello(){
        System.out.println("hhhhhh");
        return gitService.helloGit()+"o2o2o";
    }
}
