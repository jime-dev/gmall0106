package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dajin
 * @create 2020-03-30 17:36
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;  //自动导包会出现误报

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> receiveAddressByMemberId = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddressByMemberId;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
