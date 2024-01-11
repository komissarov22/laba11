package org.example;

public class QuantityCalculator {
    public static int findMaxNumberRepetitions(int[] numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            int quantity = 0;
            for (int j = i; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    quantity += 1;
                }
            }
            if (quantity > number) {
                number = quantity;
            }
        }
        return number;
    }
}
