package com.common.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * Created on 2019-04-23
 * @author fenghongyu
 */
@Setter
@Getter
public class User {
    private Long userId;
    private String userName;
    private String name;
    private Integer age;
    private BigDecimal balance;

    public User(){}

    public User(Long userId, String userName, String name, Integer age, BigDecimal balance){
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
