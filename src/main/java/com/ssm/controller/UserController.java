package com.ssm.controller;

import com.ssm.bean.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 1.controller
 * 根据请求方式get 或者 post 来对方法加上注解 RequestMapping("/访问路径") 或者postmapping("/请求路径")
 * 需要用到的servie进行加上autowired注解或者resource注解
 */
//@Controller("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;
    /**
     * @responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
     * 写入到response对象的body区，通常用来返回JSON数据或者是XML数据，需要注意的呢，在使用此注解之后不会
     * 再走试图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据。
     * @param id
     * @return
     */
    @ResponseBody
    /**
     * 用 @RequestMapping 处理 HTTP 的各种方法 
     * Spring MVC 的 @RequestMapping 注解能够处理 HTTP 请求的方法,
     * 比如 GET, PUT, POST, DELETE 以及 PATCH
     * 所有的请求默认都会是 HTTP GET 类型的
     */
    @RequestMapping("/user")
    //@ApiOperation(value = "接口测试1")
    public User findAll(Integer id){
        return userService.findAllById(id);
    }

    @ResponseBody
    @PostMapping("/login")
    public String login(String name, String password){
        int result = userService.login(name,password);
        if (result > 0){
            return "login success";
        }else {
            return "login fail";
        }
    }
}
