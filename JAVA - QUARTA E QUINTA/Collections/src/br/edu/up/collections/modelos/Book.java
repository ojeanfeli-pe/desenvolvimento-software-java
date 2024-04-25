package br.edu.up.collections.modelos;

public class Book<T> {

    private T chave;

    private String nome;

    public Book(T chave, String nome){
        this.chave = chave;
        this.nome = nome;
    }

    public T getChave() {
        return chave;
    }
    public String getNome() {
        return nome;
    }

}
