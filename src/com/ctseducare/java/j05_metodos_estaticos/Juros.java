package com.ctseducare.java.j05_metodos_estaticos;

public class Juros {

    public static double jurosSimples(double capital, double taxa, int periodo) {
        return capital * (taxa / 100) * periodo;
    }

    public static double jurosCompostos(double capital, double taxa, int periodo) {
        return capital * Math.pow((1 + (taxa/100)), periodo);
    }

}
