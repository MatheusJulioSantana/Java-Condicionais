package Exercicios_if;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int a, b, c, soma;
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.println("\nInsira o valor A: ");
        a = (int) input.nextFloat();
        System.out.println("\nInsira o valor de B: ");
        b = (int) input.nextFloat();
        System.out.println("\nInsira o valor de C: ");
        c = (int) input.nextFloat();

        // Cálculo
        soma = a + b;

        // Laço if-else
        if (soma > c) {
            System.out.println("\nA soma de A + B é maior que C.");
        } else if (soma < c) {
            System.out.println("\nA soma de A + B é menor que C.");
        } else {
            System.out.println("\nA soma de A + B é igual a C.");
        }
    }
}
