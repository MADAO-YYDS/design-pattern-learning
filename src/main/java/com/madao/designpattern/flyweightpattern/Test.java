package com.madao.designpattern.flyweightpattern;

public class Test {

    public static void main(String[] args) {

        Ticket ticket = TrainTicketFactory.getTicket("苏州", "芜湖");
        ticket.showInfo("软卧");
        System.out.println("==========");

        Ticket ticket1 = TrainTicketFactory.getTicket("苏州", "芜湖");
        ticket1.showInfo("硬卧");
        System.out.println("==========");

        Ticket ticket2 = TrainTicketFactory.getTicket("苏州", "上海");
        ticket2.showInfo("高铁二等座");


    }
}
