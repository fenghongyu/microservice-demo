//package com.consumer.movie.microserviceconsumermovie.client;
//
//import java.math.BigDecimal;
//
//import org.springframework.stereotype.Component;
//
//import com.common.entity.User;
//
//import lombok.extern.slf4j.Slf4j;
//
///**
// * Created on 2019-04-30
// * @author fenghongyu
// */
//@Slf4j
//@Component
//public class UserFeignClientFallBack implements UserFeignClient {
//
//    @Override
//    public User findByUserId(Long userId) {
//        return new User(userId, "默认数据", "默认数据", -1, new BigDecimal(1));
//    }
//}
