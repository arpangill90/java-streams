package com.arpan.liskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<ClothingItem> items = new ArrayList<>();
        items.add(new ShirtItem());
        items.add(new JacketItem());

        int total = getTotalPrice(items);
        System.out.println("Total of cart one = "+total);

        List<ShirtItem> shirts = new ArrayList<>();
        shirts.add(new ShirtItem());
        shirts.add(new ShirtItem());

        int totalPrice = getTotalPrice(shirts);//this call works as we have wild card in the method
        System.out.println("Total price for shirts = " + totalPrice);


    }

    private static int getTotalPrice(List<? extends ClothingItem> items) {
        return items.stream()
                .map(ClothingItem::price)
                .reduce(0, Integer::sum);
    }
}
