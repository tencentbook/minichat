package com.exchange.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Main {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        //新建ModelAndView视图
        ModelAndView m=new ModelAndView("main");

        //获取当前发言者的用户名
        String ip=  IPtoNameUtil.getIpAddress(request);
        String username=IPtoNameUtil.getIpName(ip);
        m.addObject("username",username);

        //获取当前发言的时间
        Date time = new Date(System.currentTimeMillis());
        String timestamp = new SimpleDateFormat("hh:mm:ss").format(time);
        if (timestamp.startsWith("0")){
            timestamp=timestamp.replaceFirst("0","");
        }

        //获取当前发言的信息
        String message=request.getParameter("sendbox");
        //没有获取到信息不放人
        if (!(null==message||"".equals(message)||message.trim().length()==0)){
            //整理为聊天列表
            ListUtil.add(timestamp+"  "+username+"："+message);
        }
        m.addObject("list",ListUtil.getQueue());

        return m;  //视图重定向main.jsp
    }
}
