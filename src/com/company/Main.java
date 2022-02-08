package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
	    int n = scanner.nextInt();

        boolean isDivisibleBy5 = n % 5 == 0;
        boolean isDivisibleBy3 = n % 3 == 0;

        if (isDivisibleBy5 && isDivisibleBy3){
            System.out.println("FizzBuzz");
        }
        else if (isDivisibleBy5){
            System.out.println("Fizz");
        }
        else if (isDivisibleBy3){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }
    }
}
