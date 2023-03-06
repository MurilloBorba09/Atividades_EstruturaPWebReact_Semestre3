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
                System.out.println("\n Nome encontrado no índice = [" + i + "] \n");
            } //else {
//                System.out.println(" O nome não foi encontrado!");
//            }
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] vetor = new String[10];

        for(int i = 0; i < 10; i++) {
            System.out.println(" Digite 10 nomes: ");
            vetor[i] = leitor.next();
        }
        exibeVetor(vetor);

        String nomeEncontrado;
        for(int i = 0; i < 10; i++) {
            System.out.println(" Agora, digite um nome qualquer: ");
            nomeEncontrado = leitor.next();
            exibeNomeVetor(vetor, nomeEncontrado);
        }
    }
}
