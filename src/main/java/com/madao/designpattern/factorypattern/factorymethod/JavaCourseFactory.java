package com.madao.designpattern.factorypattern.factorymethod;

import com.madao.designpattern.factorypattern.ICourse;
import com.madao.designpattern.factorypattern.Java;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public ICourse create() {
        return new Java();
    }
}
