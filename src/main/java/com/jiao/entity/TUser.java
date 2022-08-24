package com.jiao.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(TUser)实体类
 *
 * @author makejava
 * @since 2022-08-12 18:13:56
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -90974627145788149L;
    /**
     * 用户ID,手机号码
     */
    private Long id;
    
    private String nickname;
    /**
     * MD5(MD5(pass明文+固定salt)+salt)
     */
    private String password;
    
    private String salt;
    /**
     * 头像
     */
    private String head;
    /**
     * 注册时间
     */
    private Date registerDate;
    /**
     * 最后一次登录事件
     */
    private Date lastLoginDate;
    /**
     * 登录次数
     */
    private Integer loginCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

}

