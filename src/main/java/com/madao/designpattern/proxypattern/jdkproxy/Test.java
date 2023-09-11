package com.madao.designpattern.proxypattern.jdkproxy;

import com.madao.designpattern.proxypattern.staticproxy.DriveAdaptor;
import com.madao.designpattern.proxypattern.staticproxy.Me;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Test {

    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy();
        DriveAdaptor proxyInstance = proxy.getInstance(new Me());
        proxyInstance.drive();
    }
}
