package com.example.entities;

import java.time.LocalDate;

public class Usuarios extends Pessoas {
    public Usuarios(String nome, String email, String cpf, LocalDate dataDeCadastro, boolean ativo, String telefone) {
        super(nome, email, cpf, dataDeCadastro, ativo, telefone);
    }

    public void acessarFuncionalidadeBasica() {
        System.out.println("Acesso à funcionalidade básica.");
    }
}
