package com.ctseducare.java.j06_heranca;

public class LocadoraVeiculos {

    public static void main(String[] args) {

        var cliente = new Cliente();
        cliente.setNome("Fulano da Silva");
        cliente.setEndereco("Rua Sem nome, 999");
        cliente.setTelefone("41-998890110");
        cliente.setCpf("102.113.609-37");
        cliente.setDataNascimento("10/02/1982");

        var funcionario = new Funcionario();
        funcionario.setNome("Beltrano Gomes");
        funcionario.setEndereco("Av das coisas, 1000");
        funcionario.setTelefone("41-32002030");
        funcionario.setCpf("215.079.299-00");
        funcionario.setDataNascimento("05/12/1985");
        funcionario.setCargo("Vendedor");

    }

}
