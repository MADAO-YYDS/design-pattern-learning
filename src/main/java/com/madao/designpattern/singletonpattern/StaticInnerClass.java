package com.madao.designpattern.singletonpattern;

public class StaticInnerClass {


    private StaticInnerClass() {

    }

    public StaticInnerClass getInstance() {
        return SingletonInstanceHolder.instance;
    }

    private static class SingletonInstanceHolder {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }
}
