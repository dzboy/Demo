package com.craaaaazy.demo026;

public class Test {
    public static void main(String[] args) {

        ListPageAction listPageAction = new ListPageAction();
        listPageAction.action("July", Md5.md5("July"));
        listPageAction.action("小白", Md5.md5("小白"));

        System.out.println("----------------");

        ContentPageAction contentPageAction = new ContentPageAction();
        contentPageAction.action("July", Md5.md5("July"));
        contentPageAction.action("小白", Md5.md5("小白"));

        System.out.println("----------------");

        AdminPageAction adminPageAction = new AdminPageAction();
        adminPageAction.action("July", Md5.md5("July"));
        adminPageAction.action("小白", Md5.md5("小白"));

    }
}
