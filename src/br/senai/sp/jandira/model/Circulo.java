package br.senai.sp.jandira.model;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area + "!");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro + "!");
    }
}