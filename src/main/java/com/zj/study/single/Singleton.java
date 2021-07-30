package com.zj.study.single;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/26 15:44
 * @Description: Singleton
 */
public class Singleton {

    /**
     * 单例变量，volatile 保障可见性
     */
    private volatile static Singleton instance;

    /**
     * 私有构造方法
     */
    private Singleton() {
    }

    /**
     * 获取单例方法（双重检测锁）
     *
     * @return 返回单例对象
     */
    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }

}
