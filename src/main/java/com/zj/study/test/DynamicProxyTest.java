package com.zj.study.test;

import com.zj.study.proxy.CalculationProxyFactory;
import com.zj.study.service.Calculation;
import com.zj.study.service.HelloService;
import com.zj.study.service.impl.CalculationImpl;
import com.zj.study.service.impl.HelloServiceImpl;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/24 16:11
 * @Description:  动态代理测试
 */
public class DynamicProxyTest {


    public static void main(String[] args) {

//        CalculationImpl calculation = new CalculationImpl();
//
//        CalculationProxy proxy = new CalculationProxy(calculation);
//
//        Calculation instance = (Calculation) Proxy.newProxyInstance(proxy.getClass().getClassLoader() //类加载器
//                , calculation.getClass().getInterfaces() //接口
//                , proxy //代理类
//        );
//
//        Integer result = instance.add(5, 5);
//        System.out.println("result = " + result + "\t");
//
//        Integer result1 = instance.reduce(10, 5);
//        System.out.println("result1 = " + result1);

 //----------------------------------- 工厂模式生产代理对象 -------------------------------------------------------

        CalculationProxyFactory proxyFactory = new CalculationProxyFactory(new CalculationImpl());

        Calculation proxy = (Calculation) proxyFactory.getProxy();

        Integer add = proxy.add(5, 5);
        System.out.println("result = " + add);
        System.out.println("---------------------------------------");

        Integer reduce = proxy.reduce(5, 5);
        System.out.println("result = " + reduce);
        System.out.println("---------------------------------------");

        Integer multiply = proxy.multiply(5, 5);
        System.out.println("result = " + multiply);
        System.out.println("---------------------------------------");

        Integer div = proxy.div(5, 5);
        System.out.println("result = " + div);
        System.out.println("---------------------------------------");

//----------------------------------- 工厂模式生产代理对象 -------------------------------------------------------
        String name = "大帅比";
        CalculationProxyFactory proxyFactory1 = new CalculationProxyFactory(new HelloServiceImpl());
        HelloService proxy1 = (HelloService) proxyFactory1.getProxy();
        String s = proxy1.sayHello(name);
        System.out.println("s = " + s);

    }
}
