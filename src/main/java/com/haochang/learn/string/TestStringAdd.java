package com.haochang.learn.string;

/**
 * @Description 描述：
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-08-24 9:48
 */
public class TestStringAdd {

    public static void main(String[] args) {

    }

    public static void test1() {
        String s1 = "1";
        String s2 = "2";

        String s = s1 + s2;

        System.out.println(s);
    }

    public static void test2() {
        String s1 = "1";
        String s2 = new String("1");

        String s = s1 + s2;


    }
}
