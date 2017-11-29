package com.spring.hibernate.entities;

/**
 * Created by Administrator on 2017/11/29.
 */
public class Employee implements java.io.Serializable {
    /**该domain对象按照规范序列化，目的是可以唯一的标识该对象，同时在网络和文件传输
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private java.util.Date hiredate;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public java.util.Date getHiredate() {
        return hiredate;
    }
    public void setHiredate(java.util.Date hiredate) {
        this.hiredate = hiredate;
    }
}
