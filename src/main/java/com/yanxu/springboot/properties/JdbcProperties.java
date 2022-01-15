package com.yanxu.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {

    private DataSourceProperties2 dataSource;
    private String type;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "dataSource=" + dataSource +
                ", type='" + type + '\'' +
                '}';
    }

    public DataSourceProperties2 getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSourceProperties2 dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
