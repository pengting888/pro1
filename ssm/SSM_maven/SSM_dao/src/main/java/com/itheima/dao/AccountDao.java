package com.itheima.dao;

import com.itheima.bean.Account;


import java.util.List;

/**
 * @author PengTing
 * @create 2018-09-21-20:27
 * @desc 查询接口
 */

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

}
