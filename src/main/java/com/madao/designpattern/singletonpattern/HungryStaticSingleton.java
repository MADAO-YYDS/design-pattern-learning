package com.madao.designpattern.singletonpattern;

/**
 * @Author madao
 * @Description 饿汉式单例
 * @Date 2023/9/11
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton INSTANCE = new HungryStaticSingleton();

    private HungryStaticSingleton() {

    }

    public HungryStaticSingleton getInstance() {
        return INSTANCE;
    }
}
