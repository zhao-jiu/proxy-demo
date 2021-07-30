package com.zj.study.proxy;


import java.lang.reflect.Proxy;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/24 16:24
 * @Description: 代理对象工厂
 */
public class CalculationProxyFactory {

    private Object target;

    public CalculationProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        //第一个参数：对象的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();

        //第二个参数：接口数组
        Class<?>[] interfaces = target.getClass().getInterfaces();

        //实现InvocationHandler方法的类
        CalculationProxy calculationProxy = new CalculationProxy(target);

        //动态返回代理对象
        return Proxy.newProxyInstance(classLoader, interfaces,calculationProxy );

    }

}
