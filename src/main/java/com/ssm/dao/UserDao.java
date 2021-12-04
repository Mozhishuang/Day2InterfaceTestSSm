package com.ssm.dao;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 3.dao
 * 在dao（mapper）层中，同样也是接口
 * 在resource路径下的mapper或mappers（视个人情况而定）里面书写dao层的数据库代码实现
 */
@Mapper
public interface UserDao {
    User findAllById(Integer id);
    // @Param 用于在Mappers的xml文件中引用识别
    int login(@Param(value = "name") String name, @Param(value = "password") String password);
}
