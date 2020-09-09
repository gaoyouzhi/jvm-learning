package com.haochang.learn.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 描述：测试堆溢出
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-08-24 18:16
 */
public class HeapOverFlowTest1 {


    int[] intArr = new int[10];

    /**
     * 参数设置
     * -Xms10m -Xmx10m
     * -XX:+HeapDumpOnOutOfMemoryError
     */
    public static void main(String[] args) {
        List<HeapOverFlowTest1> objs = new ArrayList<>();

        for (;;) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            objs.add(new HeapOverFlowTest1());
        }
    }
}
