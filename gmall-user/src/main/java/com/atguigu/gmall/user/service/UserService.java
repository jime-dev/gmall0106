package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author dajin
 * @create 2020-03-30 17:37
 */
public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
