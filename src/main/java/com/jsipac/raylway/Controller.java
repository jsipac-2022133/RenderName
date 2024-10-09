package com.jsipac.raylway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping({"/","/name","/home"})
    public String getName(){
        return "James Brian Sipac Sipac";
    }
}
