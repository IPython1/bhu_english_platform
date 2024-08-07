package com.dyj.myspringboot.mapper;

import com.dyj.myspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    /**
     * 注册用户
     * 与登录用户
     */
    //增加用户--注册用户
    int addUser(User user);
    //根据激活码查询用户
    User queryUserByActiveCode(String activeCode);

    //根据账号密码和状态码(1)登录
    User loginByEmailAndPasswordAndActiveStatus(User user);
    //根据账号密码和role=1登录
    User AdminLogin(User user);
    /**
     * 操作用户
     *
     */

    //删除用户
    int deleteUser(Integer userId);
    //修改用户
    int updateUser(User user);


    //查询所有用户信息
     List<User> queryAllUser();
     //根据Id查询用户
     User queryUserById(int userId);

}
