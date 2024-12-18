package com.ctseducare.java.j01_classes;

public class TabelaPrecos {

    public static void main(String[] args) {

        var prod = new Produto();
        prod.descricao = "Caneta";
        prod.preco = 1.50;

        System.out.println("Preço distribuidor: %.2f".formatted(prod.precoDistribuidor()));
        System.out.println("Preço representante: %.2f".formatted(prod.precoRepresentante()));
        System.out.println("Preço consumidor: %.2f".formatted(prod.precoConsumitor()));

    }

}
