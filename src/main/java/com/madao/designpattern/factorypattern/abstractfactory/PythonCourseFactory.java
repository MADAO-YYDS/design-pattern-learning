package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.INote;
import com.madao.designpattern.factorypattern.IVideo;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class PythonCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
