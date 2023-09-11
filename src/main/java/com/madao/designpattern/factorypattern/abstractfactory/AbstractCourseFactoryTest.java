package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.INote;
import com.madao.designpattern.factorypattern.IVideo;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class AbstractCourseFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        INote javaNote = factory.createNote();
        javaNote.edit();
        IVideo javaVideo = factory.createVideo();
        javaVideo.watch();

        factory = new PythonCourseFactory();
        INote pythonNote = factory.createNote();
        pythonNote.edit();
        IVideo pythonVideo = factory.createVideo();
        pythonVideo.watch();
    }
}
