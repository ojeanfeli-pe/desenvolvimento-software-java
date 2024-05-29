package br.edu.up.collections;

import br.edu.up.collections.modelos.Aluno;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Set<Aluno> set = new HashSet<>();
        List<Aluno> list = new ArrayList<>();

        set.add(new Aluno("Ana",2000 ));
        set.add(new Aluno("Ana", 1998));

        list.add(new Aluno("Ana", 2000));
        list.add(new Aluno("Ana", 1998));

        Collections.sort(list);

        for (Aluno aluno: set){
           //System.out.println(aluno.getUuid());
            System.out.println(aluno.getNome() + "-" + aluno.getAnoNascimento());
        }
        System.out.println("===========================");

        for (Aluno aluno: list){
            //System.out.println(aluno.getUuid());
            System.out.println(aluno.getNome() + "-" + aluno.getAnoNascimento());
        }



    }
}
