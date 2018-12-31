package com.hang.controller;

import com.hang.pojo.Girl;
import com.hang.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 16:43 2018/12/31 43
 */
@Controller
public class GirlController {
    @Autowired
    private GirlService girlService;

    @RequestMapping("/queryGirl")
    public String  queryGirl(Model model) throws Exception{
        Girl girl = girlService.selectGirl();
        model.addAttribute("girl",girl);
        return "success";
    }
}