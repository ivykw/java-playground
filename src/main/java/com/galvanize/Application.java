package com.galvanize;
import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        HashMap<Character, Integer> numbers = new HashMap<Character, Integer>();
        numbers.put('M', 1000);
        numbers.put('D', 500);
        numbers.put('C', 100);
        numbers.put('L', 50);
        numbers.put('X', 10);
        numbers.put('V', 5);
        numbers.put('I', 1);
        int total = 0;
        String str = args[0];
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (i < str.length() - 1) {
                char next = str.charAt(i + 1);
                if (numbers.get(letter) < numbers.get(next)) {
                    total -= numbers.get(letter);
                } else {
                    total += numbers.get(letter);
                }
            } else {
                total += numbers.get(letter);
            }
        }
        System.out.println(total);
    }

}
