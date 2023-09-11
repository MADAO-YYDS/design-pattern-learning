package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.IVideo;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class PythonVideo implements IVideo {
    @Override
    public void watch() {
        System.out.println("观看python 视频");
    }
}
