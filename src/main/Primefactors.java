package main;

import java.util.Scanner;

public class Primefactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please Enter a integer number:");
        int num = sc.nextInt();
        if (num == 1 || num == 2) {
            System.out.print("");
        } else {
            int factor = 2;
            String string = "";
            while (factor <= num) {
                if (num % factor == 0) {
                    num = num / factor;
                    string += factor + ",";
                } else {
                    factor++;
                }
            }
            string = string.substring(0, string.length() - 1);
            System.out.print(string);
        }
    }
}
