package com.ctseducare.java.j03_sobrecarga;

public class TabelaPrecos {

    public static void main(String[] args) {

        var prod = new Produto();
        prod.descricao = "Fone de ouvido JBL";
        prod.preco = 127.90;

        System.out.println("Preço distribuidor: %.2f".formatted(prod.precoDistribuidor(7.5f)));
        System.out.println("Preço representante: %.2f".formatted(prod.precoRepresentante(8.5f)));
        System.out.println("Preço consumidor: %.2f".formatted(prod.precoConsumitor(10)));

    }

}
