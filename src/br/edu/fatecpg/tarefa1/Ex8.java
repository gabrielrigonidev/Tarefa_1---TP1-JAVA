package br.edu.fatecpg.tarefa1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro n: ");
        int num = scanner.nextInt();

        int soma = 0;
        int numeroImpar = 1;

        for (int i = 0; i < num; i++) {
            soma = soma + numeroImpar;
            numeroImpar = numeroImpar + 2;
        }

        System.out.println("A soma dos primeiros " + num + " números ímpares é: " + soma);
        scanner.close();
    }
}