package com.yanxu.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//bean类要放进与启动类同包或者其子包中，或者说只要是文件都要放进其同包或者其子包中，否则无法注入对象
//IOC容器扫描包时，创建当前类的bean对象，会解析@Value注解，将配置文件属性值注入到当前bean对象中
@Component
public class DataSourceProperties {
    //@Value注解可以读取配置文件中的属性----Spring中的el表达式写法${属性名}
    @Value("${spring.jdbc.datasource.driverClassName}")
    private String diverClassName;
    @Value("${spring.jdbc.datasource.url}")
    private String url;
    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @Value("${spring.jdbc.datasource.password}")
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "diverClassName='" + diverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDiverClassName() {
        return diverClassName;
    }

    public void setDiverClassName(String diverClassName) {
        this.diverClassName = diverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
