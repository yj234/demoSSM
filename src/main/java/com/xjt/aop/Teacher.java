package com.xjt.aop;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/18 10:16
 */
public class Teacher {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void f() {
        System.out.println("f()");
        //int i = 1 / 0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
