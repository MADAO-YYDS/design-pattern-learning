package com.madao.designpattern.factorypattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Python implements ICourse {
    @Override
    public void content() {
        System.out.println("python 课程");
    }
}
