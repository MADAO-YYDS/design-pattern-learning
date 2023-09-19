package com.madao.designpattern.delegatepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/19
 */
public class Manager implements IEmployee{

    private Map<String,IEmployee> map = new HashMap<>();

    public Manager() {
        map.put("编程",new EmployeeA());
        map.put("片面设计",new EmployeeB());
    }


    @Override
    public void doTask(String task) {
        if (map.containsKey(task)) {
            map.get(task).doTask(task);
        } else {
            System.out.println("没有相关员工可以完成该项工作");
        }
    }
}
