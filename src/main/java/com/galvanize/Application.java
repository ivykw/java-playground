package com.galvanize;

public class Application {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.printf(args[0]);
        }
    }

}
