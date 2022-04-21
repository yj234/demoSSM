package com.xjt.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:37
 */

@Configuration
public class AppMain2 {

    @Bean(name = "data2")
    public Data2 f(){
        return new Data2();
    }
}
