package com.teachmeskills.homework14.part3;

public class Runner {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Consumer consumer = new Consumer(serviceStation);

        Engineer engineer = new Engineer(serviceStation);

        new Thread (consumer).start();
        new Thread(engineer).start();


    }
}
