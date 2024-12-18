package com.ctseducare.java.j05_metodos_estaticos;

public class CalculoIMC {

    public static void main(String[] args) {

        var peso = 78.0;
        var altura = 1.67;

        var imc = IMC.calcularIndice(peso, altura);
        var classificacao = IMC.retornarClassificacao(imc);

        System.out.println("IMC: %.2f".formatted(imc));
        System.out.println("Classificação: %s".formatted(classificacao));

    }

}
