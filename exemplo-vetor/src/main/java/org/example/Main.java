package org.example;

import java.util.Scanner;

public class Main {

    public static void exibeVetor(int[] v) {

        //Preenchendo o vetor:


        //Exibindo o vetor:
        for(int i = 0; i < v.length; i++) {
            System.out.println("\n Vetor[" + i + "] = " + v[i]);
        }
    }

    public static void main(String[] args) {

        //Criação do scanner leitor
        Scanner leitor = new Scanner(System.in);

        //criação de um vetor de Integers, de tamanho 11
        int[] vetor = new int[5];

        //Criação de um segundo vetor de integers, já inicializado com valores
        //int[] vetor2 = {1, 2, 3, 4, 5, 6};

        //Criação de um terceiro vetor, mas agora de Strings
        //String[] vetor3 = new String[5];

        //1° Vetor:
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(" Digite o valor vetorizado[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        /*
        //2° Vetor:
        for(int i = 0; i < vetor2.length; i++) {
            System.out.println(" Digite o valor vetorizado[" + i + "]");
            vetor2[i] = leitor.nextInt();
        }

        //3° Vetor:
        for(int i = 0; i < vetor3.length; i++) {
            System.out.println(" Agora, Digite a palavra vetorizada[" + i + "]");
            vetor3[i] = leitor.next();
        }


        exibeVetor(vetor);
        exibeVetor(vetor2);
        for (String s : vetor3) {
            System.out.println( s + "\t");
        }
        */

        int soma = 0;
        for (int i : vetor) {
            soma += i;
        }
        exibeVetor(vetor);
        System.out.println("\n A soma dos elementos do vetor é = " + soma);

        int qtdPares = 0;
        for(int i : vetor) {
            if(i % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println("A quantidade de elementos pares é = " + qtdPares);

        int tamanho = 0;
        //Solicita ao usuário digitar o tamanho do vetor5
        //Esse tamanho deve ser maior que 2
        do {
            System.out.println(" Digite o tamanho do vetor5 (Deve ser maios que 2)");
            tamanho = leitor.nextInt();
        } while (tamanho <= 2);

        int[] vetor5 = new int[tamanho];

        for(int i = 0; i < vetor5.length; i++) {
            System.out.println("Digite o número vetorizada[" + i + "]");
            vetor5[i] = leitor.nextInt();
        }
        exibeVetor(vetor5);
    }
}