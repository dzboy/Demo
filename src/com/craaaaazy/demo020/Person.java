package com.craaaaazy.demo020;

public class Person {
    public String name;
    protected String firstName;

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    protected void sayHello() {
        System.out.println("My name is " + name + ", My first is " + firstName);
    }

}
