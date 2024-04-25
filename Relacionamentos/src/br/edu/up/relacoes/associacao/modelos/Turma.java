package br.edu.up.relacoes.associacao.modelos;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private List<Aluno> alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void inicializarLista(){
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
    }

    public boolean addAluno(Aluno aluno){
        this.inicializarLista();
        if (aluno.getTurma().getNome() != this.nome){
            return false;
        }
        this.alunos.add(aluno);
        return true;
    }
    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Turma(String nome) {
        this.nome = nome;
    }


}
