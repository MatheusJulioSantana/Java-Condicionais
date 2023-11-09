package Exercicios_Switch;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        // Declaração de variáveis
        float saldo = 100f;
        float valor = 0;  // Inicializado com zero para evitar erros
        float saque;
        int operacao;
        Scanner input = new Scanner(System.in);

        // Saldo inicial
        System.out.println("Saldo Inicial: R$ " + saldo);

        // Exibir opções de operação
        System.out.println("\n\t\t Opções :");
        System.out.println("\n1 - Saldo disponível");
        System.out.println("\n2 - Depósito");
        System.out.println("\n3 - Saque");
        System.out.println("\nEscolha sua operação: ");
        operacao = input.nextInt();

        // Verificação e execução da operação
        switch (operacao) {
            case 1:
                System.out.println("Saldo de: R$ " + (saldo + valor));
                break;
            case 2:
                System.out.println("Insira o valor do depósito: ");
                valor = input.nextFloat();
                saldo += valor;
                System.out.println("Saldo atualizado de: R$ " + saldo);
                break;
            case 3:
                System.out.println("Digite o valor do saque: ");
                saque = input.nextFloat();
                if (saque <= saldo + valor) {
                    System.out.println("Valor restante na conta: R$ " + ((saldo + valor) - saque));
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
    }
}

