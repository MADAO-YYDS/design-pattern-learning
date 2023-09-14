package com.madao.designpattern.adaptorpattern.objectadaptor;

import com.madao.designpattern.adaptorpattern.AC220;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Test {

    public static void main(String[] args) {
        PowerAdaptor2 powerAdaptor2 = new PowerAdaptor2(new AC220());
        int ac = powerAdaptor2.dc5();
        System.out.println(ac);
    }
}
