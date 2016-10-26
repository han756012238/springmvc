package com.qiezi.springmvc.model;

/**
 * User: qiezi
 * Date: 2016/4/11
 * Time: 17:55
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
