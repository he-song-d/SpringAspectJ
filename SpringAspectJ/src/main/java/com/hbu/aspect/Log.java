package com.hbu.aspect;

import org.springframework.stereotype.Component;

import java.io.Serializable;


//日志
@Component
public class Log implements Serializable {


    private String username;
    private double money;


    public Log() {
    }

    public Log(String username, double money) {
        this.username = username;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "日志{ 用户名:='" + username + '\'' +
                ", 余额:" + money +
                '}';
    }
}
