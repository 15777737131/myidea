package com.lanzhi.service;

import com.lanzhi.dao.GitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitService {
    @Autowired
    private GitDao dao;
    public String helloGit(){
        return dao.helloGit();
    }
}
