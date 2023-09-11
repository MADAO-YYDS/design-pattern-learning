package com.madao.designpattern.prototypepattern;

import com.madao.designpattern.prototypepattern.ConcretePrototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName("haha");
        concretePrototype.setAge(20);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("吃饭");
        hobbies.add("睡觉");
        concretePrototype.setHobbies(hobbies);

        System.out.println("========浅拷贝========");
        /**
        ConcretePrototype clonedObj = concretePrototype.clone();

        System.out.println(concretePrototype);
        System.out.println(clonedObj);

        //克隆对象是一个新对象
        System.out.println(concretePrototype == clonedObj);
        clonedObj.getHobbies().add("打豆豆");

        System.out.println(concretePrototype.getHobbies());
        System.out.println(clonedObj.getHobbies());

        //引用对象拷贝的引用地址
        System.out.println(clonedObj.getHobbies() == concretePrototype.getHobbies());
         */


        System.out.println("========深拷贝========");

        ConcretePrototype cloned1 = concretePrototype.deepClone1();
//        ConcretePrototype cloned1 = concretePrototype.deepClone2();
        System.out.println(concretePrototype);
        System.out.println(cloned1);
        System.out.println(cloned1 == concretePrototype);

        cloned1.getHobbies().add("打豆豆");

        System.out.println(concretePrototype.getHobbies());
        System.out.println(cloned1.getHobbies());

        System.out.println(concretePrototype.getHobbies() == cloned1.getHobbies());
    }
}
