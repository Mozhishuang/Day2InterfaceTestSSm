package com.ssm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 1、@Data可以为类提供读写功能，从而不用写get、set方法。
 * 2、他还会为类提供 equals()、hashCode()、toString() 方法。
 * 安装lombok插件,注意在maven中配置。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
}
