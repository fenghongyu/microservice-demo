package com.consumer.movie.microserviceconsumermovie.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common.entity.User;

/**
 * Created on 2019-04-29
 * @author fenghongyu
 */
@FeignClient(name = "microservice-provider-user", fallback = UserFeignClientFallBack.class)
public interface UserFeignClient {

    @GetMapping("/user/{userId}")
    User findByUserId(@PathVariable("userId") Long userId);
}
