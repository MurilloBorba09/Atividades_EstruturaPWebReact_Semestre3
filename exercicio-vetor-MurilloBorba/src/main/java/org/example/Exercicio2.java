package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {

    public static void exibeVetor(double[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("\n Vetor[" + i + "] = " + vetor[i] + "\n");
        }
    }

    public static double calcMedia(double[] vetor) {
        double soma = 0.0;
        double media = 0.0;
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            media = soma / vetor.length;
        }
        return media;
    }

    public static void exibeNumAcimaMedia(double[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > calcMedia(vetor)) {
                System.out.println("\n Vetor[" + i + "] = " + vetor[i] + "\n");
            }
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] vetor = new double[5];

        for(int i = 0; i < 5; i++) {
            System.out.println(" Digite um número de 1 a 10: ");
            vetor[i] = leitor.nextInt();
        }
        exibeVetor(vetor);
        System.out.println(" Média = " + calcMedia(vetor));
        exibeNumAcimaMedia(vetor);
    }
}
