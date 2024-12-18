package com.ctseducare.java.j01_classes;

public class CalcularSalario {

    public static void main(String[] args) {
        
        var func = new Funcionario();
        func.nome = "Fulano";
        func.cargo = "Vendedor";
        func.valorHora = 14.50f;

        var horasTrabalhadas = 30;
        var salario = func.calcularSalario(horasTrabalhadas);

        System.out.println("O salário é: %.2f".formatted(salario));
        
    }

}
