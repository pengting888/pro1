package com.itheima.servcie;

import com.itheima.bean.Account;

import java.util.List;

/**
 * @author PengTing
 * @create 2018-09-21-20:29
 * @desc 账单业务层
 */
public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();
}
