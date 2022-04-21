package com.xjt.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * 用户信息表
 */
public class User {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户凭证
     */
    private String passWord;

    /**
     * 用户头像地址
     */
    private String url;


    private Date createTime;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户凭证
     *
     * @return pass_word - 用户凭证
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置用户凭证
     *
     * @param passWord 用户凭证
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取用户头像地址
     *
     * @return url - 用户头像地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置用户头像地址
     *
     * @param url 用户头像地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", url='" + url + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }


}