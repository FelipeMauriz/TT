package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Pessoas;
import com.example.entities.Visita;

@SpringBootApplication
public class OrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
		
		        Pessoas acompanhante = new Pessoas("Acompanhante1", null, null, null, false, null);
		        Pessoas visitante = new Pessoas("Visitante1", null, null, null, false, null);

		        LocalDateTime entrada = LocalDateTime.now();
		        LocalDateTime saida = entrada.plusHours(1); 
		        Visita visita = new Visita(acompanhante, visitante, "Reunião", "Detalhes da reunião", entrada, saida, "ativo");

		        
		        System.out.println("Informações da visita:");
		        System.out.println("Acompanhante: " + visita.getAcompanhante());
		        System.out.println("Visitante: " + visita.getVisitante());
		        System.out.println("Motivo: " + visita.getMotivo());
		        System.out.println("Detalhes: " + visita.getDetalhes());
		        System.out.println("Entrada: " + visita.getEntrada());
		        System.out.println("Saída: " + visita.getSaida());
		        System.out.println("Status: " + visita.getStatus());
		    }
		}


