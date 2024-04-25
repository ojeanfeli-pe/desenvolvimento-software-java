package br.edu.up.polimorfirsmo.modelos;

public class Gato extends Animal{
    public Gato(String name) {
        super(name);
    }
    public void emitirSom(){
        System.out.println(super.getName() + " está miando");
    }
}
