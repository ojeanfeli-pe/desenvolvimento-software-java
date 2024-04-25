import java.util.Scanner;

public class Ex02 {
    //Escreva um programa em Java que imprima os primeiros n termos da sequência de Fibonacci. A sequência de Fibonacci é uma sequência de
    // números inteiros onde cada número é a soma dos dois números anteriores na sequência. A sequência começa com 0 e 1.
    //• Por favor, implemente um programa que solicite ao usuário um número inteiro; Em seguida, imprima os primeiros n termos da
    // sequência de Fibonacci.
    //• Utilizar um método chamando calcularFibinacci que recebe o valor informado pelo usuário como parâmetro.

    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja calcular: ");
        int n = scanner.nextInt();

        calcularFibonacci(n);
        // Chamada do método para calcular e imprimir os termos da sequência
    }

    /**
     * Método usado para para fazer os calculos.
     * @param n
     */
    public static void calcularFibonacci(int n) {
        int Fn1 = 1;
        int Fn2 = 1;
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        System.out.print(Fn1 + " "); // Imprime o primeiro termo

//if usado para calcular e imprimir os resultados na tela
        if (n > 1) {
            System.out.print(Fn2 + " "); // Imprime o segundo termo

            // Calcula e imprime os próximos termos da sequência
            for (int i = 2; i < n; i++) {
                int proximoTermo = Fn1 + Fn2;
                System.out.print(proximoTermo + " ");
                Fn1 = Fn2;
                Fn2 = proximoTermo;
            }
        }
    }

}
