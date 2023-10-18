package br.senai.sp.jandira.model;

public class Retangulo implements FormaGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = comprimento * largura;
        System.out.println("A área do retângulo é: " + area+ "!");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (comprimento + largura);
        System.out.println("O perímetro do retângulo é: " + perimetro+ "!");
    }
}