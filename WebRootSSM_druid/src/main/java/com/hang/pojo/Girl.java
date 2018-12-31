package com.hang.pojo;

import org.springframework.stereotype.Component;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 16:36 2018/12/30 36
 */
@Component
public class Girl {
    int id;
    String password;
    String account;

    public void hello(){
        System.out.println("hello world!!");
    }

    @Override
    public String toString() {
        return "GirlMapper{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
