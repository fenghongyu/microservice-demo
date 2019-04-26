package com.consumer.movie.microserviceconsumermovie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.common.entity.User;

/**
 * Created on 2019-04-23
 * @author fenghongyu
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/user/{userId}")
    public User queryUser(@PathVariable Long userId){
        String url = "http://127.0.0.1:8000/user/" + userId;
        return restTemplate.getForObject(url, User.class);
    }
}
