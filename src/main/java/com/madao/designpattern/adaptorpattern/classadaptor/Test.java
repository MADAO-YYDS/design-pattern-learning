package com.madao.designpattern.adaptorpattern.classadaptor;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Test {

    public static void main(String[] args) {
        PowerAdaptor1 powerAdaptor = new PowerAdaptor1();
        int dc5 = powerAdaptor.dc5();
        System.out.println(dc5);
    }
}
