package com.cheer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "user/login")
    public String login(String username, String password, Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("loginUsername",username);
            return "dashboard";
        }else{
            map.put("msg","用户名或密码错误");
            return "index";
        }
    }
}
