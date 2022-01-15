package com.yanxu.springboot.config;

import com.yanxu.springboot.properties.DataSourceProperties2;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration//配置类
public class JdbcConfig {
    @Bean//声明Bean对象
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")//创建对象后注入属性值
    public DataSourceProperties2 createDataSourceProperties(){
        return new DataSourceProperties2();
    }
}
