package com.ctseducare.java.j04_encapsulamento;

public class AgendaContatos {

    public static void main(String[] args) {

        var contato1 = new Contato("Fulano da Silva", "41-987870101", "fulanosilva@gmail.com");
        var contato2 = new Contato("Siclano Gomes", "41-32442131", "siclano_gomes@yahoo.com.br");

        System.out.println(contato1.getNome() + ", " + contato1.getTelefone());
        System.out.println(contato2.getNome() + ", " + contato2.getTelefone());

    }

}
