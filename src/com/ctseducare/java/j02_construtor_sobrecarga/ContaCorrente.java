package com.ctseducare.java.j02_construtor_sobrecarga;

class ContaCorrente {

    public String numero;
    public double saldo;
    public int limite;

    public ContaCorrente(String numero, double saldo, int limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

}
