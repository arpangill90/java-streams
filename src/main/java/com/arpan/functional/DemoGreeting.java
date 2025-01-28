package com.arpan.functional;

public class DemoGreeting {

    public static void main(String[] args) {
        Greeting hello = () -> System.out.println("hello");
        hello.pintMessage();
    }
}
