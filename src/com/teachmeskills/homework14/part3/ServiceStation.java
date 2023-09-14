package com.teachmeskills.homework14.part3;

public class ServiceStation {
    private int cars = 0;

    public synchronized void get() {
        while (cars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        cars--;

        System.out.println("Механник починил 1 машину");
        System.out.println("Машин на СТО: " + cars);

        notify();
    }

    public synchronized void put() {
        while (cars == IMaximumCapacity.maxCapacity) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }

        cars++;

        System.out.println("Клиент привёз авто на обсуложивание");
        System.out.println("Всего авто на обслуживании: " + cars);

        notify();
    }

}
