package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class LineComparison3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //accepting co-ordinates for line one
        System.out.println("Enter co-ordinates  For X1");
        int x1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For X2");
        int x2 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y2 = sc.nextInt();

        //calculating line 1
        Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);

        System.out.println("\n");
        //Accepting co-ordinates for line 2
        System.out.println("Enter co-ordinates  For A1");
        int a1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For B1");
        int b1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For A2");
        int a2 = sc.nextInt();
        System.out.println("Enter co-ordinates For B2");
        int b2 = sc.nextInt();
        //calculating Line 2
        int length2 = (int) Math.sqrt((a2 - a1) * 2 + (b2 - a1) * 2);

        //printing Both lines
        System.out.println("Length of 1st line is : " + length1);
        System.out.println("Length of second line is : " + length2);
        //Calculating the Length is equal or not by using java equal method

        boolean result = length1.equals(length2);

        if (result == true)
            System.out.println("Length of lines are same...");
        else
            System.out.println("Lines are not equals...");


        // Comparing two line by using compareTo method

        int result1 = length1.compareTo(length2);
        if(result1 > 0) {
            System.out.println("Line 1 are greater ");
        }
        else if(result1 < 0) {
            System.out.println("Line2 is greater");
        }
        else
        {
            System.out.println("both line are equal");
        }

    }
}
