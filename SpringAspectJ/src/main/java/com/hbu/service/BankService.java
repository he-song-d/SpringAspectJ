package com.hbu.service;

import com.hbu.aspect.Log;

import java.util.List;

public interface BankService {

    //存钱、
    List<Log> save(String username, double m);
    // 取钱、
    List<Log> mulit(String username, double m);
    // 转账
    List<Log> TransMoey(String ausername, String musername, double m);
}
