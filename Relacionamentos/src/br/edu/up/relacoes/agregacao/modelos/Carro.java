package br.edu.up.relacoes.agregacao.modelos;

public class Carro {

    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.motor = motor;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor.getPotencia() +
                '}';
    }
}
