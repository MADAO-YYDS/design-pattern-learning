package com.madao.designpattern.proxypattern.staticproxy;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Test {

    public static void main(String[] args) {
        Me me = new Me();
        DriveAdaptor proxy = new DriveAdaptee(me);
        proxy.drive();
    }
}
