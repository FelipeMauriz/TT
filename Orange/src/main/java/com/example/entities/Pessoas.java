package com.example.entities;

import java.time.LocalDate;

public class Pessoas {
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataDeCadastro;
    private boolean ativo;
    private String telefone;

    public Pessoas(String nome, String email, String cpf, LocalDate dataDeCadastro, boolean ativo, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataDeCadastro = dataDeCadastro;
        this.ativo = ativo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeCadastro=" + dataDeCadastro +
                ", ativo=" + ativo +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
