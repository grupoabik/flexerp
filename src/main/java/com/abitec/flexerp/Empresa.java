package com.abitec.flexerp;

public class Empresa {
    private String nome;
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void imprimirDados() {
        System.out.println("Empresa: " + nome + " | CNPJ: " + cnpj);
    }
}
