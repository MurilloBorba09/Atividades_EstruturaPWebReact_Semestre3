package org.example;

import java.util.Scanner;

public class Exercicio4 {

    public static void exibeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("\n Vetor[" + i + "] = " + vetor[i] + "\n");
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[3];
        for(int i = 0; i < 3; i++) {
            System.out.println(" Digite um número de 1 a 10: ");
            vetor[i] = leitor.nextInt();
        }
        exibeVetor(vetor);
    }
}
