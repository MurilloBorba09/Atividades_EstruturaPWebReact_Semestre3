package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 números: ");
        Integer num1 = scan.nextInt();
        Integer num2 = scan.nextInt();
        Integer num3 = scan.nextInt();

        System.out.printf(" num1 = %d, num2 = %d, num3 = %d\n", num1, num2, num3);
    }
}