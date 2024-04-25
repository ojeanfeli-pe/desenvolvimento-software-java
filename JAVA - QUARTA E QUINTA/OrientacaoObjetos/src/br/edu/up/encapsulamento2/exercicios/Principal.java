package br.edu.up.encapsulamento2.exercicios;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Janusqueide");
        pessoa.setIdade(15);

        System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
    }
}
