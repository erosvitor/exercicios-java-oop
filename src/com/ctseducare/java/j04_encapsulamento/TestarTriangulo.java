package com.ctseducare.java.j04_encapsulamento;

public class TestarTriangulo {

    public static void main(String[] args) {

        var triangulo = new Triangulo();
        triangulo.setLado1(10);
        triangulo.setLado2(14);
        triangulo.setLado3(18);

        if (triangulo.ehTriangulo()) {
            System.out.println("Os lados formam um triângulo");
            System.out.println(triangulo.obterTipoTriangulo());
        } else {
            System.out.println("Os lados NÃO formam um triângulo");
        }

    }

}
