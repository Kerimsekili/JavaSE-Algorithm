package com.javase.algorithms.primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("Bir pozitif sayı giriniz : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(primeNumber.isPrime(n));
        primeNumber.countNumberOfPrimesUpTo(n);
    }


    void countNumberOfPrimesUpTo(int n) {
        long start = System.currentTimeMillis();
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            boolean prime = isPrime(i);
            if (prime)
                numberOfPrimes++;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(n + " sayısına kadar " + numberOfPrimes + " kadar asal sayı vardır.");
        System.out.println("Time : " + time + " ms.");
    }


    boolean isPrime(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
//        if (prime)
//            System.out.println(n + "is prime!");
//        else
//            System.out.println("İlk bölen : " + i);
        return prime;
    }
}
