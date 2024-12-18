package com.ctseducare.java.j02_construtor_sobrecarga;

public class TestarContaCorrente {

    public static void main(String[] args) {

        var conta1 = new ContaCorrente("0101-02", 5000, 1000);
        conta1.depositar(1000);
        conta1.sacar(570);

        System.out.println(conta1.consultarSaldo());

    }

}
