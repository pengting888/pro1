package com.itheima.controller;

import com.itheima.bean.Account;
import com.itheima.servcie.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author PengTing
 * @create 2018-09-21-21:25
 * @desc 控制器
 */
@RequestMapping("/account")
@Controller
public class AccountController {
    @Autowired
    //调用业务层
    private AccountService accountService;
    @RequestMapping("/list")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);



        return "accountall";
    }

}
