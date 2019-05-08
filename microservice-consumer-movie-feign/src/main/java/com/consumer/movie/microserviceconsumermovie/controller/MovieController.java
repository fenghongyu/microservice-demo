package com.consumer.movie.microserviceconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.entity.User;
import com.consumer.movie.microserviceconsumermovie.client.UserFeignClient;

/**
 * Created on 2019-04-23
 * @author fenghongyu
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private UserFeignClient userFeignClient;

    @ResponseBody
    @GetMapping("/user/{userId}")
    public User findByUserId(@PathVariable Long userId) {
        return userFeignClient.findByUserId(userId);
    }

    @ResponseBody
    @GetMapping("/userInstance")
    public String queryUserInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user");
        return serviceInstance.getServiceId()+" ; "+serviceInstance.getHost()+" ; "+serviceInstance.getPort();
    }
}
