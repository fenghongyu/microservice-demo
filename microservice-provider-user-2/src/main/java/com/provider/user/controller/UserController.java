package com.provider.user.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.entity.User;

/**
 * Created on 2019-04-23
 * @author fenghongyu
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userId}")
    public User findById(@PathVariable Long userId) {
        return getUser(userId);
    }

    private User getUser(Long userId) {
        if(userId == 1) {
            return new User(1L, "tangyuan", "feng", 26, new BigDecimal(100));
        } else if(userId == 2) {
            return new User(2L, "xiao", "wang", 16, new BigDecimal(80));
        } else {
            return new User(3L, "test", "de", 6, new BigDecimal(60));
        }
    }
}
