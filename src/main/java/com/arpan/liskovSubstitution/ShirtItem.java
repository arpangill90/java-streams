package com.arpan.liskovSubstitution;

public class ShirtItem implements ClothingItem {
    @Override
    public String itemName() {
        return "Shirt";
    }

    @Override
    public int price() {
        return 10;
    }
}
