package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.IVideo;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class JavaVideo implements IVideo {
    @Override
    public void watch() {
        System.out.println("观看java视频");
    }
}
