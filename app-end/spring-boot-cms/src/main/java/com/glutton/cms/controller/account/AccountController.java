package com.glutton.cms.controller.account;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CMSUserAccount;
import com.glutton.cms.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijun_isf
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/doLogin")
    public JSONObject doLogin(@RequestParam String accountName, @RequestParam String accountPassword){
        return accountService.doLogin(accountName, accountPassword);
    }

    @RequestMapping("/add")
    public JSONObject addCount(){

        return null;
    }
}
