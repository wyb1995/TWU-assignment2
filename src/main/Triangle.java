package main;

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        System.out.print("*\n");
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter a int number:");

        int horizontal = sc.nextInt();

        for(i = 0; i < horizontal; i++) {
            System.out.print("*");
        }

        System.out.print("\nplease enter a int number:");

        int vertical = sc.nextInt();

        for(i = 0; i < vertical; i++) {
            System.out.print("*\n");
        }

        System.out.print("\nplease enter a int number:");

        int triangle = sc.nextInt();
        String asterisk = "*";

        for(i = 0; i < triangle; i++) {

            System.out.print(asterisk + "\n");
            asterisk += "*";
        }
    }
}
