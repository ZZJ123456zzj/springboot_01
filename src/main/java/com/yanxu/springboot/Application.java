package com.yanxu.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 每一个SpringBoot项目都需要一个主启动类
*
* */
@SpringBootApplication //声明当前应用是一个SpringBoot应用
public class Application {
    public static void main(String[] args) {
        //启动tomcat，运行SpringBoot应用
        SpringApplication.run(Application.class,args);
    }
}
