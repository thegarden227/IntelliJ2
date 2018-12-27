package com.joy;

public class ClothingItem {

    private String type;

    public static void main(String[] args){
        ClothingItem item = new ClothingItem();
        item.type = "Hat";
        item.displayItem();

        String s = "Shirt Size";
        String size = "M";
        String description = s + size;
        description += ", very elegant";
        String s1 = description.toUpperCase();

        System.out.println(description);


    }

    private void displayItem() {
        System.out.println("This is a " + this.type);
    }
}
