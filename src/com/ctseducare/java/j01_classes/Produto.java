package com.ctseducare.java.j01_classes;

class Produto {

    public String descricao = "";
    public double preco = 0;

    public double precoDistribuidor() {
        return this.preco + (this.preco * (3 / 100));
    }

    public double precoRepresentante() {
        return this.preco + (this.preco * (4.5 / 100));
    }

    public double precoConsumitor() {
        return this.preco + (this.preco * (5.5 / 100));
    }

}
