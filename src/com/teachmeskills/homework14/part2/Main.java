package com.teachmeskills.homework14.part2;

public class Main {
    RunnableBreakfast breakfast = new RunnableBreakfast(new Thread());
    RunnableCoffe coffe = new RunnableCoffe(new Thread());
    RunnableReadingNews news = new RunnableReadingNews(new Thread());
}
