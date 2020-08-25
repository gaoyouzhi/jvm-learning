package com.haochang.learn.string;

/**
 * @Description 描述：
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-08-24 18:19
 */
public class TestHashcode {

    public static void main(String[] args) {
        String s1 = "11";
        String s2 = new String("11");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 比较的是什么
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}