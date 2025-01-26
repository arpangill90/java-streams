package com.arpan.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first item");
        list.add("second item");

        System.out.println(list); //list has 2 items here

        System.out.println(list.poll()); //removes and returns first item
        System.out.println(list.pop()); //removes and returns last item

        System.out.println(list); //empty list now
    }
}
