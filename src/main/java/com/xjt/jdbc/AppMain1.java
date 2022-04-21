package com.xjt.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:37
 */

@Configuration
public class AppMain1 {

    @Bean(name = "data1")
    public Data1 f(){
        return new Data1();
    }
}
