package com.alaskalany.web.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    @RequestMapping("/number")
    public int SayNumber() {
        return 5;
    }
}
