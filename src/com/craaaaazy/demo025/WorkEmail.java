package com.craaaaazy.demo025;

public class WorkEmail extends Email {
    @Override
    public String getTo() {
        return "小白";
    }

    @Override
    public String getContent() {
        return "小白我给你讲讲Java中抽象类的概念可好？";
    }
}
