package com.teachmeskills.homework14.part1;

public class ThreadReadingNews extends Thread {
    public void run(){ doReadingNewsLogic(); }

    public void doReadingNewsLogic(){
        try {
            Thread.sleep(7000);
            System.out.println("Читаем новости");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
