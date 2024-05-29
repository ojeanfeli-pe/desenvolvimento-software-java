package br.edu.up.encapsulamento.modelo;

public class Bicicleta {

    public String modelo;
    public Double velocidade;
    public Integer marcha;

    public Bicicleta(){
    }

    public Bicicleta(String modelo, Double velocidade, Integer marcha){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.marcha =  marcha;
    }

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Marcha: " + this.marcha);
    }

    public String getModelo(){
        return modelo;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

}
