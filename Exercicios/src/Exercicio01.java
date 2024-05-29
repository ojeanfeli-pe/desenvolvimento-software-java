import java.util.Scanner;

/*
Criar um programa para processar as seguintes informações de um aluno
matrícula, nome, nota 1, nota 2 e se ele está aprovado ou reprovado

Durante a execução calcular a nota final do aluno utilizando a seguinte
regra notaFinal ==(nota 1 nota 2 2 Se a nota final for igual ou
superior a 6 o aluno está aprovado, caso contrário estará reprovado

O programa deverá imprimir o seguinte relatório

Matrícula xxxxx

Nome xxxxx xxxxx

Aprovado x Sim Não

Nota final xxxxx*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Usando um loop de 5 alunos
        for (int i = 1; i <= 5; i++) {
            //Estou pedindo pro usuário inserir a MATRICULA no sistema
            System.out.println("Informe a Matrícula do Aluno: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            //Estou pedindo pro usuário inserir a NOME no sistema
            System.out.println("Informe o nome do Aluno: ");
            String nome = scanner.nextLine();

            //Estou pedindo pro usuário inserir a NOTA1 no sistema
            System.out.println("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            //Estou pedindo pro usuário inserir a NOTA2 no sistema
            System.out.println("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            //Calcular a Nota Final
            double notaFinal = (nota1 + nota2) / 2;

            //Determinando se o Aluno está Aprovado ou Reprovado
            String status;
            if(notaFinal >= 6){
                status = "(x)Sim ( )Não";
            }else{
                status = "( )Sim (x)Não";
            }

            //Imprimindo o Relatório
            System.out.println("\nRelatório do Aluno:");
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Aprovado: "+ status +" ");
            System.out.println("Nota Final: " + notaFinal);

        }
        scanner.close();
    }
}
