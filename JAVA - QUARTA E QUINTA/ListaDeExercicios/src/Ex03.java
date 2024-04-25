/*3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e
informe qual deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência
de números informados é inválida*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Informe o valor de B: ");
        int b = scanner.nextInt();

        // Verifica se os números são distintos
        if (a != b) {
            // Se os números são distintos, verifica qual é o maior
            if (a > b) {
                System.out.println("A é maior que B."); // Se A for maior, imprime essa mensagem
            } else {
                System.out.println("B é maior que A."); // Se B for maior, imprime essa mensagem
            }
        } else {
            // Se os números são iguais, imprime uma mensagem de sequência inválida
            System.out.println("A sequência de números informada é inválida, pois os números são iguais.");
        }
        scanner.close();
    }
}
