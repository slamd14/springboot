package com.example.yyx.springboot.controller;

import com.example.yyx.springboot.common.R;
import com.example.yyx.springboot.entity.User;
import com.example.yyx.springboot.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    @ResponseBody
    public R<?> save(@RequestBody User user){
        user.setPassword("123456");
        userMapper.insert(user);
        return R.success("添加新用户成功");
    }
}
