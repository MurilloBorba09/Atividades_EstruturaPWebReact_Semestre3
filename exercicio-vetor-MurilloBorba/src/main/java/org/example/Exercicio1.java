package org.example;

import java.util.Scanner;

public class Exercicio1 {

    public static void exibeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(" Vetor[" + i + "] = " + vetor[i] + "\n");
        }
    }

    public static void exibeVetorInverso(int[] vetor) {
        for(int i = vetor.length - 1; i >= 0 ; i--) {
            System.out.println(" Vetor[" + i + "] = " + vetor[i] + "\n");
        }
    }

    public static void main(String[] args) {

        int[] vetor = new int[7];

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 7; i++){
            System.out.println(" Digite um número de 1 a 7: ");
            vetor[i] = leitor.nextInt();
        }
        System.out.println(" Vetor respectivamente: \n");
        exibeVetor(vetor);
        System.out.println("\n Vetor ao inverso: \n");
        exibeVetorInverso(vetor);
    }
}
