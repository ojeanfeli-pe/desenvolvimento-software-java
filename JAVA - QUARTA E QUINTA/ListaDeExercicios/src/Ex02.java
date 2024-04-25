/*
2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Primeiro Número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o Segundo Número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma dos dois Números é: " + soma);

        scanner.close();
    }
}
