package com.hang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 13:29 2018/12/31 29
 */
@Component("girl")
public class Girl {
    Integer id;
    String account;
    String password;
    public void Hello(){
        System.out.println("Spring测试成功啦.....");
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
