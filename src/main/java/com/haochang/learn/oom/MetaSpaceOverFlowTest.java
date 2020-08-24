package com.haochang.learn.oom;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 描述：原空间溢出
 * @author: youzhi.gao
 * @date: 2020-08-24 18:14
 */
public class MetaSpaceOverFlowTest {
    /**
     * 通过CGLIB模拟向元空间写入数据
     * -XX:MetaspaceSize=10m
     * -XX:MaxMetaspaceSize=10m
     */
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //字节码增强器
            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(MetaSpaceOverFlowTest.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });

            System.out.println("running...");

            enhancer.create();
        }
    }
}
