package com.gameTime.GamePrefs.demo.Controllers;


import com.gameTime.GamePrefs.demo.Models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamePrefs {
    @Autowired
    Test test;

    @PostMapping(path = "test")
    public void test(){
        test.setupTest();


    }



}
