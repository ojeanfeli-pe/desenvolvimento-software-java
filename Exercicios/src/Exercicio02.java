import java.util.Scanner;

/*
Escreva um programa que leia o código de um determinado
produto e mostre a sua classificação Utilize a tabela abaixo
como referência
CODIGO                              DESCRIÇÃO
1                                   Alimento não-perecivel
2                                   Alimento Perecivel
3                                   Vestuário
4                                   Limpeza

*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Código do produto: ");
        int codigo = scanner.nextInt();

        String classificacao;

        switch (codigo){
            case 1:
                classificacao = "Alimento não-perecivel";
                break;
            case 2:
                classificacao = "Alimento perecivel";
                break;
            case 3:
                classificacao = "Vestuário";
                break;
            case 4:
                classificacao = "Limpeza";
                break;
            default:
                classificacao = "Código Inválido";
                break;
        }
        System.out.println("Classificação do Produto: " + classificacao);

        scanner.close();
    }
}
