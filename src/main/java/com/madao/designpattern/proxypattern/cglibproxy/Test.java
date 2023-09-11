package com.madao.designpattern.proxypattern.cglibproxy;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Test {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CglibProxy cglibProxy = new CglibProxy();
        Drive driveProxy = (Drive) cglibProxy.getInstance(new Drive("madao"));
        driveProxy.gohome();
    }
}
