package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Inventory> inventory = new ArrayList<Inventory>();
        inventory.add(new Inventory(1, "Water Bottle",2));
        inventory.add(new Inventory(2, "Redbull",5));
        inventory.add(new Inventory(3, "Celsius",5));
        inventory.add(new Inventory(4, "Juice",8));
        inventory.add(new Inventory(5, "Smoothie",8));

        Inventory a = null;
        System.out.println("ID \t Product Name \t \t Price:");

        for (int i = 0; i < inventory.size(); i++) {
            a = inventory.get(i);
            System.out.printf("\n"+"%d \t %s \t \t %.2f",a.getId(),a.getName(),a.getPrice());
        }
        System.out.println("\n");
        System.out.println("What product would you like to search? Enter product name.");

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        for (int i = 0; i < inventory.size(); i++) {
            a = inventory.get(i);
            if (userInput.equals(a.getName())) {
                System.out.println("ID \t Product Name \t \t Price:");
                System.out.printf("\n"+"%d \t %s \t \t %.2f",a.getId(),a.getName(),a.getPrice());
            }
            
        }


    }

}



