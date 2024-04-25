package br.edu.up.polimorfirsmo.modelos;

public class Cachorro extends Animal{
    public Cachorro(String name) {
        super(name);
    }
    public void emitirSom(){
        System.out.println(super.getName() + " está latindo");

    }

}
