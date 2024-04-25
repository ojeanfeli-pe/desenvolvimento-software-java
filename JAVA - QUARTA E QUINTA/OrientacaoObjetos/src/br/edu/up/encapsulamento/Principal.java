package br.edu.up.encapsulamento;

import br.edu.up.encapsulamento.modelo.Bicicleta;

public class Principal {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Bike",0.0, 1);

        bicicleta.setModelo("Cross 2024");

        bicicleta.imprimir();
    }
}
