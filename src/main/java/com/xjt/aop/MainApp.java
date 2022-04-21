package com.xjt.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/18 10:20
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        Teacher student = (Teacher) context.getBean("teacher");


        student.f();

    }
}
