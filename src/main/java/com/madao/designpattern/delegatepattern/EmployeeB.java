package com.madao.designpattern.delegatepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/19
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doTask(String task) {
        System.out.println("接受平面设计");
    }
}
