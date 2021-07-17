package com.yuansaysay.learning.easypoi.model;

/**
 * 用户管理业务对象
 * @author yss<br>
 * @createDate 2021/07/17 16:46
 */
public class UserManageBO {

    private Integer id;

    private String name;

    private String address;

    private String salary;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
