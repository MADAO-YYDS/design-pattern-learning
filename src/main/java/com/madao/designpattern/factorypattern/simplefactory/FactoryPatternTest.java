package com.madao.designpattern.factorypattern.simplefactory;

import com.madao.designpattern.factorypattern.ICourse;
import com.madao.designpattern.factorypattern.Java;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class FactoryPatternTest {

    public static void main(String[] args) {

        ICourse java = CourseFactory.create(Java.class);
        java.content();

    }

}
