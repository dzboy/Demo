package com.craaaaazy.demo022;

public class Son extends Father {

    public Son(String name) {
        super(name);
    }

    public void sayHello() {
//            System.out.println("My name is " + name);
    }

    public void sayMoney() {
        System.out.println("I am rich, I have " + money + " RMB");
    }

    public static void main(String[] args) {
        Son son = new Son("Son");
        son.setMoney(100000000);
        son.sayMoney();
    }
}
