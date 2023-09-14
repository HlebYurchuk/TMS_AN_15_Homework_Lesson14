package com.teachmeskills.homework14.part2;

public class RunnableCoffe implements Runnable{

    private Thread thread;

    public RunnableCoffe(Thread coffe){
        coffe = new Thread(this);
        coffe.start();
        coffe.setPriority(5);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Завариваем кофе");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
