package org.example;

import java.util.Scanner;

public class Main {

    public static void exibeQtdAluno(String[] vetor) {
        int qtdAlunos = 0;
        for(int i = 0; i < vetor.length; i++) {
            qtdAlunos++;
        }
        System.out.println(" Quantidade de alunos da turma: " + qtdAlunos);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] t1 = new String[10];
        String[] t2 = new String[10];
        int contadorT1 = 0;
        int contadorT2 = 0;

        int contador = 0;
        while(contador <= 2) {
            System.out.println(" Digite a sala desse aluno: ");
            String salaDigitada = leitor.next();

            if(salaDigitada.equals("t1")) {
                System.out.println(" Digite o nome do aluno: ");
                t1[contadorT1] = leitor.next();
                contador++;
                contadorT1++;

            } else if(salaDigitada.equals("t2")) {
                System.out.println(" Digite o nome do aluno: ");
                t2[contadorT2] = leitor.next();
                contador++;
                contadorT2++;

            } else {
                System.out.println(" Sala inválida!");
            }
        }

        exibeQtdAluno(t1);
        exibeQtdAluno(t2);
    }
}