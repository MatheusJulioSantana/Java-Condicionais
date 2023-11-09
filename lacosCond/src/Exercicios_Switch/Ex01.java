package Exercicios_Switch;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        // Declaração de variáveis
        float n1, n2, resultado;
        int operacao;
        Scanner input = new Scanner(System.in);

        // Input dos números
        System.out.println("\nInsira o primeiro valor: ");
        n1 = input.nextFloat();
        System.out.println("\nInsira o segundo valor: ");
        n2 = input.nextFloat();

        // Exibir opções de operações e guardar o resultado
        System.out.println("\n\t\t Operações :");
        System.out.println("\n1 - Soma");
        System.out.println("\n2 - Subtração");
        System.out.println("\n3 - Multiplicação");
        System.out.println("\n4 - Divisão ");
        System.out.println("\nEscolha sua operação: ");
        operacao = input.nextInt();

        // Execução da operação
        switch (operacao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (n2 > 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Divisão por 0 não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");

        }
    }
}

