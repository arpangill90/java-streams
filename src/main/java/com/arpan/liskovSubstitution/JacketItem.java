package com.arpan.liskovSubstitution;

public class JacketItem implements ClothingItem {
    @Override
    public String itemName() {
        return "Jacket";
    }

    @Override
    public int price() {
        return 20;
    }
}
