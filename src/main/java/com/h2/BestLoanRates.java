package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRate = Map.of(1,5.50f,2,3.45f,3,2.67f);

    public static float getRates(int loanTermInYears) {
        if (bestRate.containsKey(loanTermInYears)) {
            return bestRate.get(loanTermInYears);
        }
        return 0.0f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();

        float bestRate = getRates(loanTermInYears);
        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + bestRate + "%");
        }

        scanner.close();
    }
}