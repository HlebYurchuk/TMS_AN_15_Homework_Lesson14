package com.teachmeskills.homework14.part1;

public class ThreadBreakfast extends Thread{

    public void run() { doBreakfastLogic(); };

    private void doBreakfastLogic(){
        try {
            Thread.sleep(1000);
            System.out.println("Готовим завтрак");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
