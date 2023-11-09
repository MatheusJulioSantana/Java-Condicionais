package Exercicios_if;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int numero;
        Scanner input = new Scanner(System.in);

        // Input do valor
        System.out.println("\nInsira um valor: ");
        numero = (int) input.nextFloat();

        // Laço condicional
        if (numero >= 0 && numero % 2 == 0) {
            System.out.println("\nO número " + numero + " é par e positivo.");
        } else if (numero < 0 && numero % 2 == 0) {
            System.out.println("\nO número " + numero + " é par e negativo.");
        } else if (numero < 0 && numero % 2 != 0) {
            System.out.println("\nO número " + numero + " é ímpar e negativo.");
        } else if (numero > 0 && numero % 2 != 0) {
            System.out.println("\nO número " + numero + " é ímpar e positivo.");
        }
    }
}


