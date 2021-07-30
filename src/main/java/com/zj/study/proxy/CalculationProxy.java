package com.zj.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/24 16:06
 * @Description:
 */
public class CalculationProxy implements InvocationHandler {

    private Object target;

    public CalculationProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法执行前
        System.out.println("方法执行前.........方法名："+method.getName()+",参数：" + Arrays.toString(args));

        //方法执行
        Object result = method.invoke(target, args);
        System.out.println("方法执行............");

        //方法执行之后
        System.out.println("方法执行之后.........,结果为：" + result);

        return result;
    }
}
