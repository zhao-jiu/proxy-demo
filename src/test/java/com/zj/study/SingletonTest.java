package com.zj.study;

import com.zj.study.single.Singleton;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/26 15:49
 * @Description:
 */
public class SingletonTest {

    public static void main(String[] args) {
        //测试单例模式
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Singleton instance = Singleton.getInstance();
                System.out.println("instance = " + instance);
            },"线程"+i).start();
        }
    }
}
