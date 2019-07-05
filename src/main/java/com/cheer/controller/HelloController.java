package com.cheer.controller;

import com.cheer.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("hello")
    public  String hello(@RequestParam("user") String user){
        if("aaa".equals(user)){
            throw new UserNotExistException("用户不存在");
        }
        return "hello jack";
    }

    @RequestMapping("/success")
    public String success(Model model){
        String name = "jiangbei";
        model.addAttribute("name", name);
        return "success";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }


}
