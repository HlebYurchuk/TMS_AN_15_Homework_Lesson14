package com.teachmeskills.homework14.part2;

public class RunnableReadingNews implements Runnable{

private Thread thread;

public RunnableReadingNews(Thread news){
     news = new Thread();
     news.setPriority(1);
     news.start();
}

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            System.out.println("Читаем новости");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
