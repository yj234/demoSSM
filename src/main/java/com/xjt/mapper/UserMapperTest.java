package com.xjt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*指定用哪个单元测试类来执行*/
@RunWith(value = SpringJUnit4ClassRunner.class)
/*@ContextConfiguration可以指定spring配置文件的位置,然后帮我们自动生成IOC容器*/
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserMapperTest {

    @Autowired
    private  UserMapper userMapper;


    @Test(expected = ArithmeticException.class)
    public void test(){
//        User user = userMapper.findByid(2);
//        Assert.assertNotNull(user);
//        System.out.println("fda");
        System.out.println(1/0);
        System.out.println("name.getName()"); // 直接跳过，什么也不输出
    }

}