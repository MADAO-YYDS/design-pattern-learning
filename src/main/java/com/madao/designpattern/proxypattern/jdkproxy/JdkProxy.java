package com.madao.designpattern.proxypattern.jdkproxy;

import com.madao.designpattern.proxypattern.staticproxy.DriveAdaptor;
import com.madao.designpattern.proxypattern.staticproxy.Me;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author madao
 * @Description jdk代理需要被代理对象和代理对象实现同一个接口
 * @Date 2023/9/11
 */
public class JdkProxy implements InvocationHandler {

    private DriveAdaptor target;

    public DriveAdaptor getInstance(DriveAdaptor target) {
        this.target = target;
        return (DriveAdaptor) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public void before() {
        System.out.println("呼叫代驾");
    }

    public void after() {
        System.out.println("安全到家");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }
}
