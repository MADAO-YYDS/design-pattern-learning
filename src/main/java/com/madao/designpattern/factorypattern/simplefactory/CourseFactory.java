package com.madao.designpattern.factorypattern.simplefactory;

import com.madao.designpattern.factorypattern.ICourse;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class CourseFactory {

    public static ICourse create(Class<? extends ICourse> clazz) {
        try{
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
