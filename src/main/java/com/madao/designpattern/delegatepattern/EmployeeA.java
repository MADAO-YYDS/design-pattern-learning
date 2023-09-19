package com.madao.designpattern.delegatepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/19
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doTask(String task) {
        System.out.println("接受编程任务");
    }
}
