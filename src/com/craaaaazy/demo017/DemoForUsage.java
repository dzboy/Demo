package com.craaaaazy.demo017;

public class DemoForUsage {

    public void usage1() {
        int a;
        for (a = 0; a < 2; a++) {
            System.out.println("in for a = " + a);
        }
        System.out.println("end for a = " + a);
        System.out.println("===========================");
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("in for i = " + i);
        }
        System.out.println("end for i = " + i);
    }

    public void usage2() {
        int i = 0;
        for (; i < 3; ) {
            System.out.println("in for i = " + i);
            i++;
        }
        System.out.println("end for i = " + i);
    }

    /*  第三种使用场景代码开始处 */
    private boolean run = true;
    private int runTimes;

    private boolean isRun() {
        return run;
    }

    public void run() {
        runTimes++;
        System.out.println("run times = " + runTimes);
        if (runTimes > 10) {
            run = false;
        }
    }

    public void usage3() {
        for (; isRun(); ) {
            run();
        }
    }

    /* 第三种使用场景代码结束处 */

    public void usage4() {
        // 写法 a
        for (int next = 1, before = 0, current = 1;
             next < 1000;
             next = current + before, before = current, current = next) {
            System.out.print(next + "  ");
        }

        System.out.println("");
        System.out.println("==============");

        // 写法 b

        int before = 0;
        int current = 1;
        for (int next = 1; next < 1000; ) {
            System.out.print(next + "  ");
            next = current + before;
            before = current;
            current = next;
        }

        System.out.println("");
        System.out.println("==============");

        // 写法 c
        before = 0;
        current = 1;
        for (int next = 1; next < 1000; next = current + before) {
            System.out.print(next + "  ");
            before = current;
            current = next;
        }

    }

    public static void main(String[] args) {
        DemoForUsage usage = new DemoForUsage();
        usage.usage4();
    }
}
