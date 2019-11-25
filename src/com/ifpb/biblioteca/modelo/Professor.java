package com.ifpb.biblioteca.modelo;

public class Professor extends Pessoa {

    private float salario;

    public Professor(String cpf, String nome, float salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
