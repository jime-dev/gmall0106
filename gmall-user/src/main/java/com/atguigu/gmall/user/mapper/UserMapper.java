package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author dajin
 * @create 2020-03-30 17:39
 */

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
