package com.itheima.servcie.impl;

import com.itheima.bean.Account;

import com.itheima.dao.AccountDao;
import com.itheima.servcie.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PengTing
 * @create 2018-09-21-20:54
 * @desc 业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl  implements AccountService {

    @Autowired
    //调用dao层
    private AccountDao accountDao;
    public List<Account> findAll(){
        //调用业务层查询所有
        List<Account> list = accountDao.findAll();

        return list;
    }
}
