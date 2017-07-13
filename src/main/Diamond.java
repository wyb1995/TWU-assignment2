package main;

import java.util.Scanner;

public class Diamond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter Isosceles Triangle height:");

        int isosceles = sc.nextInt();
        for (int y = 1; y <= isosceles; y++) {
            for (int x = 1; x <= 2 * isosceles - 1; x++) {
                if ((y >= -x + isosceles + 1) && (y >= x - isosceles + 1))
                    System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println("");
        }

        System.out.print("please enter Diamond height:");

        int diamond = sc.nextInt();
        for (int i = 0; i < diamond - 1; i++) {
            for (int x = i + 1; x < diamond; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < (i + 1) * 2 - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < diamond; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            for (int y = i; y < 2 * diamond - i - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("please enter Diamond height:");

        int Diamond = sc.nextInt();

        System.out.println("please enter name:");

        String name = sc.next();

        for (int i = 0; i < Diamond - 1; i++) {
            for (int x = i + 1; x < Diamond; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < (i + 1) * 2 - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < Diamond; i++) {
            if(i == 0){
                System.out.print(name);
            }else{
                for (int x = 0; x < i; x++) {
                    System.out.print(" ");
                }
                for (int y = i; y < 2 * Diamond - i - 1; y++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
