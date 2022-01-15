package com.yanxu.springboot.controller;

//所有组件类，都应该存放在主启动类所在的包，或者子包下
//aaaa
import com.yanxu.springboot.properties.DataSourceProperties;
import com.yanxu.springboot.properties.DataSourceProperties2;
import com.yanxu.springboot.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//morningEveryOne
@RestController
public class HelloController {
    @Autowired
    DataSourceProperties dataSourceProperties;
    @Autowired
    DataSourceProperties2 dataSourceProperties2;
    @Autowired
    JdbcProperties jdbcProperties;
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello,Spring Boot !!!! "+name;
    }

    @RequestMapping("/datasource")
    public String data(){
        return dataSourceProperties.toString();
    }

    @RequestMapping("/datasource2")
    public String data2(){
        return jdbcProperties.toString();
    }
}
