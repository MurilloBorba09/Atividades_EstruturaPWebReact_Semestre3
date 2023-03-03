package org.example;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] diaSemana = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};

        int numDigitado = 0;
        do {
            System.out.println(" Digite um número entre 1 e 7: ");
            numDigitado = leitor.nextInt();
        } while (numDigitado < 1 || numDigitado > 7);

        //Exibindo o dia da semana correspondente:
        System.out.println(" O dia da semana correspondente é = " + diaSemana[numDigitado - 1]);
    }
}
