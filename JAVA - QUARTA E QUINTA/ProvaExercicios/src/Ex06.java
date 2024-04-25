import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
   //usamos uma class publica para criar os dados do aluno
   public static ArrayList<Aluno> alunos = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args) {
        int opcao;
//menu de opção para o usuario
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo aluno");
            System.out.println("2. Exibir dados dos alunos cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
//switch para que ele escolha o que fazer, se novo cadastro ou exibir ou sair
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    exibirAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    /**
     * Método para cadastrar cada aluno
     */
    public static void cadastrarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Nota: ");
        double nota = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, idade, nota);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    //aqui fizemos um if para exibir se não temos cadastro ou se tem quais sao os alunos cadastrados.
    public static void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() +
                        ", Matrícula: " + aluno.getMatricula() +
                        ", Idade: " + aluno.getIdade() +
                        ", Nota: " + aluno.getNota());
            }
        }
    }
}

