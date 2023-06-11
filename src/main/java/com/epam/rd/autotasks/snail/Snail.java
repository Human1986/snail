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


        int distance = up - down;
        int day = 1;

        if (down >= up && up < height) {
            System.out.println("Impossible");
            return;
        } else if (up >= height) {
            System.out.println(day);
            return;
        }

        while (distance < height) {
            distance = distance + up;
            day++;
            if (distance >= height) {
                System.out.println(day);
                return;
            }
            distance = distance - down;
        }
        scanner.close();
    }
}
