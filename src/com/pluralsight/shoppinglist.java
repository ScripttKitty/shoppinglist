package com.pluralsight;

public class shoppinglist {
    public static void main(String[] args) {

        //Created a String Array named list to hold 10 items
        String[] list = {"eggs", "cheese", "bread", "cereal", "oatmeal", "milk", "apples", "bananas", "rice", "onions"};

        //Printing out a header for the array list
        System.out.println("Shopping List:");

        //Creating a for loop to display the objects in list array
        for (String str : list) {
            System.out.println(str);
        }
    }
}


