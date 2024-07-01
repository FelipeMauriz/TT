package com.example.entities;

import java.time.LocalDate;

public class Colaborador extends Usuarios {
    public Colaborador(String nome, String email, String cpf, LocalDate dataDeCadastro, boolean ativo, String telefone) {
        super(nome, email, cpf, dataDeCadastro, ativo, telefone);
    }

    @Override
    public void acessarFuncionalidadeBasica() {
        System.out.println("Acesso à funcionalidade básica com permissões limitadas.");
    }
}