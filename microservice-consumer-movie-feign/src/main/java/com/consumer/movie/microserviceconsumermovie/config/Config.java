package com.consumer.movie.microserviceconsumermovie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * Created on 2019-04-26
 * @author fenghongyu
 */
@Configuration
public class Config {

    /**
     * ClientHttpRequestFactory接口的第一种实现方式，即：
     * SimpleClientHttpRequestFactory：底层使用java.net包提供的方式创建Http连接请求
     * @return
     */
    @Bean
    public SimpleClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setReadTimeout(5000);
        requestFactory.setConnectTimeout(5000);
        return requestFactory;
    }

    @Bean
    public IRule getIRule() {
        return new RoundRobinRule();
    }
}
