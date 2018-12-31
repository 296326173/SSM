package com.hang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 17:29 2018/12/30 29
 */
@Controller
public class A  {
    @RequestMapping("/a")
    public String testMvc(){
        System.out.println("跳转success.jsp");
        return "success";
    }
}
