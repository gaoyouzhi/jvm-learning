package com.haochang.learn.test;

import com.haochang.learn.model.ArrayObj;
import com.haochang.learn.model.EmptyObj;
import com.haochang.learn.model.StringObj;
import com.haochang.learn.model.TypeObj;
import org.openjdk.jol.info.ClassLayout;

/**
 * @description: 描述：测试指针压缩
 * @author: youzhi.gao
 * @date: 2020-08-20 09:26
 */
public class TestCompressed {

    public static void main(String[] args) {
        //1.默认开启指针压缩

        //空对象占用字节数 16B
        EmptyObj emptyObj = new EmptyObj();
        System.out.println(ClassLayout.parseInstance(emptyObj).toPrintable());

        //数组类型占用字节数 32B
        int[] arr = new int[]{1,2,31,23};
        System.out.println(ClassLayout.parseInstance(arr).toPrintable());

        //基本类型对象占用字节数 24B
        Long l = new Long(1234L);
        System.out.println(ClassLayout.parseInstance(l).toPrintable());

        //string 占用字节数 24B
        String str = new String("string");
        System.out.println(ClassLayout.parseInstance(str).toPrintable());


    }
}
