package com.zj.study.service.impl;

import com.zj.study.service.HelloService;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/24 16:51
 * @Description:
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
