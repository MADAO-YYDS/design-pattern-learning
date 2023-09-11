package com.madao.designpattern.factorypattern.abstractfactory;

import com.madao.designpattern.factorypattern.INote;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编辑Python 笔记");
    }
}
