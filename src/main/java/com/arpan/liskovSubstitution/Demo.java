package com.arpan.liskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<ClothingItem> items = new ArrayList<>();
        items.add(new ShirtItem());
        items.add(new JacketItem());

        int total = getTotalPrice(items);

        System.out.println(total);
    }

    private static int getTotalPrice(List<ClothingItem> items) {
        return items.stream()
                .map(ClothingItem::price)
                .reduce(0, Integer::sum);
    }
}
