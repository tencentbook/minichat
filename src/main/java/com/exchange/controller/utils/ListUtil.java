package com.exchange.controller.utils;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ListUtil {
    private static ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();

    public static ConcurrentLinkedQueue getQueue() {
        return queue;
    }

    public static void add(String str) {
        if (queue.size()>20){
            queue.remove();
        }
        queue.offer(str);
    }
}
