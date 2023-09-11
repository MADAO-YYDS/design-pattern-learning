package com.madao.designpattern.proxypattern.staticproxy;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Me implements DriveAdaptor{
    @Override
    public void drive() {
        System.out.println("开车回家");
    }
}
