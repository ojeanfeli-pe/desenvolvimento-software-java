import java.util.ArrayList;
import java.util.Scanner;
//classe  Aluno para informar nome, matricula, idade e nota.
class Aluno {
    public String nome;
    public int matricula;
    public int idade;
    public double nota;

    public Aluno(String nome, int matricula, int idade, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
}
