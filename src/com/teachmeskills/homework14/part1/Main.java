package com.teachmeskills.homework14.part1;

public class Main {
    public static void main(String[] args) {

        ThreadBreakfast breakfast = new ThreadBreakfast();
        breakfast.setPriority(10);
        breakfast.start();

        ThreadCoffe coffe = new ThreadCoffe();
        coffe.setPriority(5);
        coffe.start();

        ThreadReadingNews news = new ThreadReadingNews();
        coffe.setPriority(1);
        news.start();
    }
}
