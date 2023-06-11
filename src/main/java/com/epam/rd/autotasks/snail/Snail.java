package com.epam.rd.autotasks.snail;
import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int height = scanner.nextInt();

        if ((up <= down)) {
            System.out.println("Impossible");
        } else {
            int day = 1;
            int start = up;

            while (start < height) {

                start = (start + up) - down;
                day++;
            }
            System.out.println(day);
        }
        scanner.close();
    }
}
