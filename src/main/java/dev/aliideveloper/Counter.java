package dev.aliideveloper;

public class Counter {
    private static int count=0;
    private final int id;

    public Counter(){
        count++;
        id=count;
    }

    public int getId() {
        return id;
    }

    public static int getTotal(){
        return Counter.count;

    }
}
