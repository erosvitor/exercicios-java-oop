package com.ctseducare.java.j01_classes;

class Funcionario {
    
    public String nome = "";
    public String cargo = "";
    public float valorHora = 0.0f;

    public float calcularSalario(int horasTrabalhadas) {
        return this.valorHora * horasTrabalhadas;
    }
    
}
