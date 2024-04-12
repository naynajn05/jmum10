package com.tnsif.test;
import java.util.function.Function;

public class FactorialUsingLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int number = 5; // Change this to the desired number
        int result = factorial.apply(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
