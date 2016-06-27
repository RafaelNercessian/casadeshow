package com.casadeshow.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.casadeshow.modelo.Evento;

@Repository
public class EventoDao {
	
	private List<Evento> eventos;

	public List<Evento> listaEventos(){
		Evento evento1 = new Evento();
		evento1.setId(1);
		evento1.setNome("Avicii");
		evento1.setDescricao("Avicii é o melhor DJ do mundo");
		evento1.setData("20/11/2016");
		
		Evento evento2 = new Evento();
		evento2.setId(2);
		evento2.setNome("Hardwell");
		evento2.setDescricao("Hardwell veio da Holanda!");
		evento2.setData("31/12/2016");
		
		eventos = Arrays.asList(evento1,evento2);
		return eventos;
	}
	
	public Evento buscaEvento(Integer id){
		Evento eventoBuscado=new Evento();
		for (Evento evento : eventos) {
			if(evento.getId()==id){
				eventoBuscado=evento;
				break;
			}
		}
		return eventoBuscado;
	}
	
}
