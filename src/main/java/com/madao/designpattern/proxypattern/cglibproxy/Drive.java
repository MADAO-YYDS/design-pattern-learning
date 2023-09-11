package com.madao.designpattern.proxypattern.cglibproxy;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Drive {

    private String name;

    public Drive() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drive(String name) {
        this.name = name;
    }

    void gohome() {
        System.out.println(this.name);
        System.out.println("开车回家");
    }
}
