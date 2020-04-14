package com.zz.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    //账户
    private String username;
    //手机
    private String phone;
    //昵称
    private String nickName;
    //密码
    private String password;
    //盐值
    private String salt;

}
