package com.binzikeji.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description
 * @Author Bin
 * @Date 2019/5/27 15:50
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.binzikeji.oauth2.server.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
