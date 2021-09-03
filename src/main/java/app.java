/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        String input;
        Scanner scan;

        System.out.println("How many people are there?");

        scan = new Scanner(System.in);
        input = scan.next();
        int people = Integer.parseInt(input);

        System.out.println("How many pizzas do you have?");

        scan = new Scanner(System.in);
        input = scan.next();
        int pizzas = Integer.parseInt(input);

        System.out.println("How many slices per pizza are there?");

        scan = new Scanner(System.in);
        input = scan.next();
        int slices = Integer.parseInt(input);

        int totalSlices = pizzas * slices;
        int leftovers = 0;

        while(totalSlices % people != 0)
        {
            totalSlices--;
            leftovers++;
        }

        System.out.println(String.format("Each person should get %d slices! There will be %d leftover slices.", totalSlices / people, leftovers));
    }
}
