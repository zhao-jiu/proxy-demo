package com.zj.study.test;

import com.zj.study.proxy.HelloProxy;
import com.zj.study.service.impl.HelloServiceImpl;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/23 9:20
 * @Description: 静态代理测试
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy(new HelloServiceImpl());
        String result = helloProxy.sayHello("hello world!");
        System.out.println("result = " + result);
    }
}
