package br.edu.up.heranca;

import br.edu.up.heranca.modelo.Carro;
import br.edu.up.heranca.modelo.Moto;
import br.edu.up.heranca.modelo.SUV;
import br.edu.up.heranca.modelo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        SUV suv = new SUV("Fiat", "BMW", "13", 6);
        suv.setMarca("BMW");
        System.out.println(suv);

        Veiculo veiculo = new Veiculo("Dodge", "RAM");
        System.out.println(veiculo);

        System.out.println("=====================");


        Veiculo carro = new Carro("Fiat", "BMW", "i3");
        System.out.println(carro);

        System.out.println("=====================");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("BMW", "i3", "4"));
        veiculos.add(new Carro("Fiat", "Uno", "2"));
        veiculos.add(new Moto("BMW", "GS 650", 5));
        veiculos.add(new Moto("Honda", "CB 1000", 2));
        System.out.println(veiculos.toString());

        for (Veiculo v : veiculos){
            if (v instanceof Carro){
                System.out.println("Carro");
                continue;
            }
            System.out.println(v);
        }
    }
}
