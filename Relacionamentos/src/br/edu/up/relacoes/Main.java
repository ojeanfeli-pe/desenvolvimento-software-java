package br.edu.up.relacoes;

import br.edu.up.relacoes.associacao.modelos.Aluno;
import br.edu.up.relacoes.associacao.modelos.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma("Des. Software");
        Turma turma2 = new Turma("Banco de Dados");

        for (int i = 1; i <= 5; i++) {
            Aluno aluno = new Aluno("Aluno " + i);
            aluno.setTurma(turma);

            if (i == 2){
                var aux = turma2.addAluno(aluno);
                System.out.println(aux);
                continue;
            }
            turma.addAluno(aluno);
        }

        System.out.println(turma);


    }
}
