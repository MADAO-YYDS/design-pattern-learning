package com.madao.designpattern.proxypattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) throws InvocationTargetException, IllegalAccessException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;

    }

    public void before() {
        System.out.println("呼叫代驾");
    }

    public void after() {
        System.out.println("安全到家");
    }

    /**
     *
     * @param o 代理对象
     * @param method 被代理对象的方法
     * @param objects 方法入参
     * @param methodProxy 方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o, objects);
        after();
        return invoke;
    }
}
