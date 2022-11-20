package com.example.yyx.springboot.controller;

import com.example.yyx.springboot.common.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public R save(){
        return R.success(null);
    }
}
