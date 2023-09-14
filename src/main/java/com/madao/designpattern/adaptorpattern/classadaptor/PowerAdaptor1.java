package com.madao.designpattern.adaptorpattern.classadaptor;

import com.madao.designpattern.adaptorpattern.AC220;
import com.madao.designpattern.adaptorpattern.DC5;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class PowerAdaptor1 extends AC220 implements DC5 {
    @Override
    public int dc5() {
        return super.ac220()/44;
    }
}
