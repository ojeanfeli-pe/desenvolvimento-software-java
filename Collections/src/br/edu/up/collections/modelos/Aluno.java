package br.edu.up.collections.modelos;

import java.util.Comparator;
import java.util.UUID;

public class Aluno implements Comparable<Aluno> {
    private UUID uuid;
    private String nome;
    private Integer anoNascimento;

    public Aluno(String nome, Integer anoNascimento){
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(UUID uuid, String nome) {
        this.uuid = uuid;
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno aluno) {
        int idx = this.nome.compareTo(aluno.getNome());
        if (idx != 0){
            return idx;
        }
        return this.anoNascimento.compareTo(aluno.getAnoNascimento());
    }
}
