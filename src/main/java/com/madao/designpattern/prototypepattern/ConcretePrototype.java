package com.madao.designpattern.prototypepattern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/11
 */
public class ConcretePrototype implements Cloneable,Serializable{

    private String name;
    private int age;
    private List<String> hobbies;

    public ConcretePrototype() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    /**
     * 通过对引用对象再次进行clone实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public ConcretePrototype deepClone1() throws CloneNotSupportedException {
        ConcretePrototype prototype = (ConcretePrototype) super.clone();
        ArrayList<String> arrayList = new ArrayList<>(this.getHobbies());
        List<String> clonedHobbies = (List<String>) arrayList.clone();
        prototype.setHobbies(clonedHobbies);
        return prototype;
    }

    /**
     * 通过反序列化进行深拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ConcretePrototype deepClone2() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ConcretePrototype) ois.readObject();
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
