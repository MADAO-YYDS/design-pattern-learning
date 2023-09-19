package com.madao.designpattern.delegatepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/19
 */
public class Test {

    public static void main(String[] args) {
        String task = "编程";
        Manager manager = new Manager();
        manager.doTask(task);
        System.out.println("==========");

        manager.doTask("报表统计");
        System.out.println("==========");

        manager.doTask("片面设计");
    }
}
