package com.madao.designpattern.adaptorpattern.interfaceadaptor;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Test {

    public static void main(String[] args) {
        AbstractAdaptor dc22 = new AbstractAdaptor() {
            @Override
            public int dc22() {
                return 22;
            }
        };
        System.out.println(dc22.dc22());

        AbstractAdaptor dc5 = new AbstractAdaptor() {
            @Override
            public int dc5() {
                return 5;
            }
        };
        System.out.println(dc5.dc5());
    }



}
