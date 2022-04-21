package com.xjt.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:37
 */

@Configuration
@Import({AppMain1.class,AppMain2.class})
public class AppMain {
}
