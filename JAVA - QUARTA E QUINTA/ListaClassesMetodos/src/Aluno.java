import java.util.Scanner;


    // Classe Aluno para representar os dados de cada aluno
    class Aluno {
        private String nome;
        private double nota1, nota2, nota3;

        // Método para configurar o nome do aluno
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Método para configurar as notas do aluno
        public void setNotas(double nota1, double nota2, double nota3) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        // Método para calcular a média do aluno
        public double calcularMedia() {
            return (nota1 + nota2 + nota3) / 3;
        }

        // Método para exibir o nome e a média do aluno
        public void exibirInformacoes() {
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Média: " + calcularMedia());
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedindo ao usuário para inserir os dados do aluno
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite a nota da primeira prova:");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota da segunda prova:");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a nota da terceira prova:");
            double nota3 = scanner.nextDouble();

            // Criando um objeto aluno e configurando seus dados
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setNotas(nota1, nota2, nota3);

            // Exibindo as informações do aluno
            aluno.exibirInformacoes();

            scanner.close();
        }
    }
}
