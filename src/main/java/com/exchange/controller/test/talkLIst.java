package com.exchange.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class talkLIst {

    @RequestMapping("/talkList")
    public ModelAndView talkList(HttpServletRequest request, HttpServletResponse response){
        //新建ModelAndView视图
        ModelAndView m=new ModelAndView("talkList");

        m.addObject("list",ListUtil.getQueue());

        return m;
    }
}
