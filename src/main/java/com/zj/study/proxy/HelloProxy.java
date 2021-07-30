package com.zj.study.proxy;

import com.zj.study.service.HelloService;
import com.zj.study.service.impl.HelloServiceImpl;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/23 9:13
 * @Description:
 */
public class HelloProxy implements HelloService {

    private HelloService target;

    public HelloProxy(HelloServiceImpl target) {
        this.target = target;
    }

    @Override
    public String sayHello(String name) {
        before();
        String result = target.sayHello(name);
        System.out.println("执行方法，结果 = " + result);
        after();
        return result;
    }

    private void before() {
        System.out.println("代理HelloService,方法执行之前。。。。。");
    }

    private void after() {
        System.out.println("代理HelloService,方法执行之后。。。。。");
    }


}
