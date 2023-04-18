package com.epam.verapi.model;

public class Employee {

    private int age;
    private String name;
    private String position;

    public Employee(int age, String name, String position) {
        this.age = age;
        this.name = name;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
