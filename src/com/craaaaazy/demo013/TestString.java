package com.craaaaazy.demo013;

public class TestString {
    public static void main(String[] args) {
        // 代码a片段
        String strA = new String("好");
        String strANew = new String("好");
        System.out.println("============代码a结果=============");
        System.out.println(strA == strANew);
        System.out.println(strA.equals(strANew));

        System.out.println("============代码b结果=============");
        // 代码b 片段
        String strB = new String("好");
        String strBNew = strB;
        System.out.println(strB == strBNew);
        System.out.println(strB.equals(strBNew));

    System.out.println("============代码c结果=============");
    // 代码c 片段
    String strC = "好";
    String strCNew = "好";
    System.out.println(strC == strCNew);
    System.out.println(strC.equals(strCNew));

    }
}
