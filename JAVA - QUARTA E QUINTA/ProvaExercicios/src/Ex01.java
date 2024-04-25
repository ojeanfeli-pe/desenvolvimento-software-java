import java.util.Scanner;

public class Ex01 {
    //Desenvolva um programa que solicite ao usuário que insira as notas de um aluno em três disciplinas.
    // O programa deve calcular a média das notas e exibir uma mensagem de feedback personalizada, indicando se
    // o aluno foi aprovado ou reprovado em cada disciplina (nota mínima para aprovação: 7).

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da matrix de alunos contendo 5 linhas e 4 colunas
        String[][] alunos = new String[3][3];

        // Laço de repetição para armazenar os valores dos alunos
        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite o matéria: ");
            alunos[i][0]= scanner.nextLine();

            System.out.println("Digite a Nota 1: ");
            alunos[i][1] = scanner.nextLine();

            System.out.println("Digite a Nota 2: ");
            alunos[i][2] = scanner.nextLine();
        }
// Laço de repetição para calular e exibir os dados dos alunos
        for (int i = 0; i < alunos.length; i++) {

            // Calculo da nota final do aluno na posição de i
            var notaFinal = (Double.parseDouble(alunos[i][1]) +
                    Double.parseDouble(alunos[i][2]) ) / 2;

            // if implicito para verificar se o aluno está aprovado
            var status = notaFinal < 7 ?
                    "Aprovado: Não "
                    :
                    "Aprovado: Sim" ;

            System.out.println("Relatorio de notas: ");
            System.out.println();
            System.out.println("Matéria: " + alunos[i][0]);
            System.out.println(status);
            System.out.println("Nota Final: " + notaFinal);
        }
        scanner.close();
    }
}
