package com.madao.designpattern.factorypattern.factorymethod;

import com.madao.designpattern.factorypattern.ICourse;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        ICourse java = factory.create();
        java.content();

        factory = new PythonCourseFactory();
        ICourse python = factory.create();
        python.content();

    }
}
