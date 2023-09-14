package com.teachmeskills.homework14.part1;

public class ThreadCoffe extends Thread{

    public void run() { doCoffeLogic();}

    public void doCoffeLogic() {
        try {
            Thread.sleep(5000);
            System.out.println("Завариваем кофе");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
