    package com.craaaaazy.demo019;

    public class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("My name is " + name);
        }

        public String writeName() {
            return name;
        }

    }
