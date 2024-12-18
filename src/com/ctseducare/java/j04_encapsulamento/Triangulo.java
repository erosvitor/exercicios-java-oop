package com.ctseducare.java.j04_encapsulamento;

public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public boolean ehTriangulo() {
        return (lado1 > Math.abs(lado2 - lado3) && lado1 < (lado2 + lado3))
                && (lado2 > Math.abs(lado1 - lado3) && lado2 < (lado1 + lado3))
                && (lado3 > Math.abs(lado1 - lado2) && lado3 < (lado1 + lado2));
    }

    public String obterTipoTriangulo() {
        var tipoTriangulo = "";

        if (lado1 == lado2 && lado1 == lado3)
            tipoTriangulo = "Equilátero";
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
            tipoTriangulo = "Escaleno";
        else
            tipoTriangulo = "Isósceles";

        return tipoTriangulo;
    }

}
