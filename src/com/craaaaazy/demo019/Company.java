package com.craaaaazy.demo019;

public class Company {
    private Person person;
    private String record;
    public void employ(Person person) {
        this.person = person;
        record = person.name;
    }

    public void printRecord() {
        System.out.println("公司雇佣了 " + record);
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.employ(new Person("July"));
        company.printRecord();
    }
}
