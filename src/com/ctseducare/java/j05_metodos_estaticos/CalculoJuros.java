package com.ctseducare.java.j05_metodos_estaticos;

public class CalculoJuros {

    public static void main(String[] args) {

        var jurosSimples = Juros.jurosSimples(1000, 10, 1);
        System.out.println("Juros simples: %.2f".formatted(jurosSimples));

        var jurosCompostos = Juros.jurosCompostos(1000, 10, 1);
        System.out.println("Juros compostos: %.2f".formatted(jurosCompostos));

    }

}
