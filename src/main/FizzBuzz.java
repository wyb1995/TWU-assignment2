package main;

public class FizzBuzz {
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("FizzBuzz");
                }
                System.out.print("Buzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
