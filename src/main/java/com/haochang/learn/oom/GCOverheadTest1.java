package com.haochang.learn.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * JVM花费了98%的时间进行垃圾回收，而只得到2%可用的内存，频繁的进行内存回收(最起码已经进行了5次连续的垃圾回收)，
 * JVM就会曝出java.lang.OutOfMemoryError: GC overhead limit exceeded错误
 * JVM参数设置
 *
 * -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -Xloggc:../logs/gc.log
 *
 * -XX:+PrintGC 输出GC日志
 * -XX:+PrintGCDetails 输出GC的详细日志
 * -XX:+PrintGCTimeStamps 输出GC的时间戳（以基准时间的形式）
 * -XX:+PrintGCDateStamps 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
 * -XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
 * -Xloggc:../logs/gc.log 日志文件的输出路径
 */
public class GCOverheadTest1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        Integer val = 0;

        for (;;) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add((val++).toString());
        }
    }
}
