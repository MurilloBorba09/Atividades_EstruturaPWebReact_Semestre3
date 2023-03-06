package org.example;

import java.util.Scanner;

public class Exercicio3 {

    public static void exibeVetor(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("\n Vetor[" + i + "] = " + vetor[i] + "\n");
        }
    }

    public static void exibeNomeVetor(String[] vetor, String nome) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].equals(nome)) {
                System.out.println("\n Esse nome tem na lista = " + vetor[i] + "\n");
            } else {
                System.out.println(" Esse nome não tem na lista!");
            }
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] vetor = new String[3];

        for(int i = 0; i < 3; i++) {
            System.out.println(" Digite 10 nomes: ");
            vetor[i] = leitor.next();
        }
        exibeVetor(vetor);
        exibeNomeVetor(vetor, "Murillo");
    }
}
