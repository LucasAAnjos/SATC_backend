package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping("/player")
    public String getPlayer() throws Exception {
        return playerService.getPlayer();
    }
//
//    @GetMapping("/export"){
//        public void getXML(){
//
//        }
//    }
}
