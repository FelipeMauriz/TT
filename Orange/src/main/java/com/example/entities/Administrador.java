package com.example.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuarios {
    private List<Visita> visitas;

    public Administrador(String nome, String email, String cpf, LocalDate dataDeCadastro, boolean ativo, String telefone) {
        super(nome, email, cpf, dataDeCadastro, ativo, telefone);
        this.visitas = new ArrayList<>();
    }

    public void adicionarVisita(Visita visita) {
        visitas.add(visita);
    }

    public void listarVisitas() {
        for (Visita visita : visitas) {
            System.out.println(visita);
        }
    }

    public void consultarVisitasPorStatus(String status) {
        for (Visita visita : visitas) {
            if (visita.getStatus().equalsIgnoreCase(status)) {
                System.out.println(visita);
            }
        }
    }

    public void consultarVisitasPorNomeVisitante(String nomeVisitante) {
        for (Visita visita : visitas) {
            if (visita.getVisitante().getNome().equalsIgnoreCase(nomeVisitante)) {
                System.out.println(visita);
            }
        }
    }
}
