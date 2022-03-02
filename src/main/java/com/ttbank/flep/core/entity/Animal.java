package com.ttbank.flep.core.entity;

/**
 * @Author lucky
 * @Date 2022/1/27 14:15
 */
public class Animal {
    //定义私有成员变量
    private String name;
    private String age;
    //定义公有成员变量
    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getNameAndAge(){
        //类内部可以访问私有成员变量
        return "name:"+name+"; age:"+age;
    }

    private void eat(){
        System.out.println(name+"正在吃饭....");
    }
}
