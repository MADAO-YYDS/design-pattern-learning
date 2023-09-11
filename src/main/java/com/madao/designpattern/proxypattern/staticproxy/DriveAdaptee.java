package com.madao.designpattern.proxypattern.staticproxy;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class DriveAdaptee implements DriveAdaptor{

    private Me me;

    public DriveAdaptee(Me me) {
        this.me = me;
    }

    @Override
    public void drive() {
        System.out.println("呼叫代驾");
        me.drive();
    }
}
