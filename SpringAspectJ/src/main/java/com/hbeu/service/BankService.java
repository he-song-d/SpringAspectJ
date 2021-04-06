package com.hbeu.service;
import com.hbeu.aspect.Log;
import java.util.List;
public interface BankService {

    //存钱、
    List<Log> save(String username, double m);
    // 取钱、
    List<Log> mul(String username, double m);
    // 转账
    List<Log> Trans(String ausername, String musername, double m);
}
