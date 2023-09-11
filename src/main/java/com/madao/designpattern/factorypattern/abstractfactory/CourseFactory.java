package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.INote;
import com.madao.designpattern.factorypattern.IVideo;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public abstract class CourseFactory {

    public void init() {
        System.out.println("初始化数据...");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
