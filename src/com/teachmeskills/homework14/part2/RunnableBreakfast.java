package com.teachmeskills.homework14.part2;

public class RunnableBreakfast implements Runnable{
    private Thread thread;

    public RunnableBreakfast (Thread breakfast) {
        breakfast = new Thread(this);
        breakfast.setPriority(10);
        breakfast.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Завтрак готов");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
