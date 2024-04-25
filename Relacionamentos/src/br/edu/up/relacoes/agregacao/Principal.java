package br.edu.up.relacoes.agregacao;

import br.edu.up.relacoes.agregacao.modelos.Carro;
import br.edu.up.relacoes.agregacao.modelos.Motor;

public class Principal {
    public static void main(String[] args) {
        Motor motor800v = new Motor(800);
        Motor motor400v = new Motor(400);
        Motor motor200v = new Motor(200);
        Carro bugatti = new Carro("Bugatti", motor800v);
        Carro ferrari = new Carro("Ferrari", motor400v);
        Carro fusca = new Carro("Fusca", motor200v);


        System.out.println(bugatti);
        System.out.println(ferrari);
        fusca.setMotor(motor800v);
        fusca.setModelo("Novo Fusca");
        System.out.println(fusca);


    }
}
