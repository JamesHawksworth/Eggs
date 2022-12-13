package org.example;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {

        final double dozenPrice = 3.25;
        final double singlePrice = 0.45;
        int dozenEggs = 12;
        int quantity;
        int dozensNeeded;
        int singlesNeeded;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("The price for a dozen eggs is £" + dozenPrice + " and £" + singlePrice + " for single eggs.");
        System.out.println("Please enter the number of eggs you would like >>");
        quantity = Integer.parseInt(input.nextLine());
        System.out.println("You entered " + quantity + " Eggs");
        dozensNeeded = quantity / dozenEggs;
        singlesNeeded = quantity % dozenEggs;
        System.out.println("You requested " + quantity + " eggs which works out at " + dozensNeeded + " dozens and " + singlesNeeded + " single eggs");
        total = (dozensNeeded * dozenPrice) + (singlesNeeded * singlePrice);
        System.out.println("The total cost for your order is £" + total);
    }
}