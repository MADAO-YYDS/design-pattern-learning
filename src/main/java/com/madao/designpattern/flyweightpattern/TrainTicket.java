package com.madao.designpattern.flyweightpattern;

import java.util.Random;

public class TrainTicket implements Ticket{

    private String from;
    private String to;

    public TrainTicket(String from,String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        System.out.println(from + "-->" + to + " 价格：" + new Random().nextInt(500) + " 座铺：" +bunk);
    }
}
