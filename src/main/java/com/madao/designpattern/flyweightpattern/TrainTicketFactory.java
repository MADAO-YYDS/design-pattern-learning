package com.madao.designpattern.flyweightpattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TrainTicketFactory {

    private static Map<String,Ticket> pool = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from,String to) {
        String key = from + "-->" + to;
        if (pool.containsKey(key)) {
            System.out.println("使用缓存");
            return pool.get(key);
        }
        TrainTicket trainTicket = new TrainTicket(from, to);
        pool.put(key,trainTicket);
        return trainTicket;
    }
}
