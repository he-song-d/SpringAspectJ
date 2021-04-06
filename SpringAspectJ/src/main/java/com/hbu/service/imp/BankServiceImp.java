package com.hbu.service.imp;
import com.hbu.aspect.Log;
import com.hbu.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BankServiceImp implements BankService {

    @Autowired
    private Log log;

    private String id;

    private String username;

    private double money;

    //设置两个默认的用户
    static List<Log> stringList = Arrays.asList(new Log("张三", 500), new Log("李四", 900));


    public BankServiceImp() {
    }

    public BankServiceImp(String id, String username, double money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    //存钱
    @Override
    public List<Log> save(String username, double m) {
        for (Log log1 : stringList) {
            if (log1.getUsername().equals(username)) {
                log1.setMoney(log1.getMoney() + m);
                return Arrays.asList(log1);
            }
        }
        return null;
    }


    //取钱
    @Override
    public List<Log> mulit(String username, double m) {

        for (Log log1 : stringList) {
            if (log1.getUsername().equals(username)) {
                log1.setMoney(log1.getMoney() - m);
                return Arrays.asList(log1);
            }
        }
        return null;
    }


    //转账
    @Override
    public List<Log> TransMoey(String ausername, String musername, double m) {
        List<Log> logs = new ArrayList<>();
        for (Log log1 : stringList) {
            //判断余额增加的用户
            if (ausername.equals(log1.getUsername())) {
                log1.setMoney(log1.getMoney() + m);
                logs.add(log1);
                //判断余额减少的用户
            } else if (musername.equals(log1.getUsername())) {
                log1.setMoney(log1.getMoney() - m);
                logs.add(log1);
            }
        }
        return logs;
    }
}