package br.edu.fatecpg.tarefa1.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextDouble();
        if(num > 0){
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }
    }
}