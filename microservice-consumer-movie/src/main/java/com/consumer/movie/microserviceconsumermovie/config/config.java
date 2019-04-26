package com.consumer.movie.microserviceconsumermovie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2019-04-26
 * @author fenghongyu
 */
@Configuration
public class config {

    /**
     * 返回RestTemplate
     * @param factory
     * @return
     */
    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
        //消息转换器，一般情况下可以省略，只需要添加相关依赖即可
        return new RestTemplate(factory);
    }

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
}
