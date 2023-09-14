package com.madao.designpattern.adaptorpattern.objectadaptor;

import com.madao.designpattern.adaptorpattern.AC220;
import com.madao.designpattern.adaptorpattern.DC5;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class PowerAdaptor2 implements DC5 {

    private AC220 ac;

    public PowerAdaptor2(AC220 ac) {
        this.ac = ac;
    }


    @Override
    public int dc5() {
        return ac.ac220()/44;
    }
}
