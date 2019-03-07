package com.jovi.magic.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
@RestController
public class IndexController {

    @GetMapping(value = "/login/hello")
    public String index() {
        return "Hello World.";
    }

    @GetMapping(value = "/auth")
    @PreAuthorize(value = "hasAnyRole('admin', 'staff')")
    public String authIndex() {
        return "authed";
    }
}
