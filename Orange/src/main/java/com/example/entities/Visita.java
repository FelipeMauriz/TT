package com.example.entities;

import java.time.LocalDateTime;

public class Visita {
    private Pessoas acompanhante;
    private Pessoas visitante;
    private String motivo;
    private String detalhes;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private String status; 
    
    
    public Visita(Pessoas acompanhante, Pessoas visitante, String motivo, String detalhes, LocalDateTime entrada, LocalDateTime saida, String status) {
        this.acompanhante = acompanhante;
        this.visitante = visitante;
        this.motivo = motivo;
        this.detalhes = detalhes;
        this.entrada = entrada;
        this.saida = saida;
        this.status = status;
    }

    public Pessoas getAcompanhante() {
        return acompanhante;
    }

    public Pessoas getVisitante() {
        return visitante;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "acompanhante=" + acompanhante +
                ", visitante=" + visitante +
                ", motivo='" + motivo + '\'' +
                ", detalhes='" + detalhes + '\'' +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", status='" + status + '\'' +
                '}';
    }
}
