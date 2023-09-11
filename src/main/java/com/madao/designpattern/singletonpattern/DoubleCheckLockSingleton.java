package com.madao.designpattern.singletonpattern;

/**
 * @Author madao
 * @Description 双重检查锁 + 禁止指令重排序 单例实现
 * @Date 2023/9/11
 */
public class DoubleCheckLockSingleton {

    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton(){

    }

    public DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
