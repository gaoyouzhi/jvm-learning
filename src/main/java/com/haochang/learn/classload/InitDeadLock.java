package com.haochang.learn.classload;

import java.util.concurrent.TimeUnit;

/**
 * @Description 描述：初始化死锁
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-08-24 9:49
 */
public class InitDeadLock {

    public static void main(String[] args) {
        new Thread(() -> A.test()).start();
        new Thread(() -> B.test()).start();
    }
}

class A {
  static {
      System.out.println("class A init");

      try {
          TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      new B();
  }

  public static void test() {
      System.out.println("aaa");
  }
}

  class B{

    static {
        System.out.println("class B init");

        new A();
    }


    public static void test() {
        System.out.println("bbb");
    }
}