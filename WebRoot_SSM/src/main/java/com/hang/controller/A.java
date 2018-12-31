package com.hang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 16:19 2018/12/31 19
 */
@Controller
public class A  {
    @RequestMapping("/a")
    public String testMvc(){
        System.out.println("跳转success.jsp");
        return "success";
    }
}