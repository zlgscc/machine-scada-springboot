package com.example.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @ProjectName: machine-scada
 * @Package: com.example.admin.controller
 * @Description:
 * @Author: zhangshuai
 * @CreateDate: 2018/8/27 15:12
 * @UpdateDate: 2018/8/27 15:12
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/")
    public String toLogin(){
        return "login";
    }

    @GetMapping(value = "/toindex")
    public String toIndex(){
        return "index";
    }


}
