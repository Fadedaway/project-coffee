package com.jovi.magic.controller;

import com.jovi.magic.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/admin")
    public String setUpAdmin(String mobile, String password) {
        userInfoService.setUpAdmin(mobile, password);
        return "OK";
    }
}
