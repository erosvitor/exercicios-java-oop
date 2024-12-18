package com.ctseducare.java.j02_construtor_sobrecarga;

public class TestarCalendario {

    public static void main(String[] args) {

        var cal = new Calendario("17/12/2024");
        System.out.println(cal.mesPorExtenso());
        System.out.println(cal.dataPorExtenso());

    }

}
