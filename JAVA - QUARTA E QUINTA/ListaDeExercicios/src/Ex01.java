/*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”
, caso este número seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual.*/
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SOLICITA AO USUÁRIO QUE INSIRA UM NÚMERO
        System.out.println("Insira um número: ");

        //CAPTURA O NÚMERO DIGITADO
        int numero = scanner.nextInt();

        //VERIFICAR SE O NÚMERO É MAIOR QUE 1O OU NÃO
        if (numero > 10){
            //SE FOR MAIOR, EXIBE A MENSAGEM
            System.out.println("Número maior que 10!");
        }else{
            //SE FOR MENOR, EXIBE A MENSAGEM
            System.out.println("Número menor que 10!");
        }
        //FECHA O SCANNER PARA LIBERAR O RECURSO
        scanner.close();
    }
}
