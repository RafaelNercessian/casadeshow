package com.casadeshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.casadeshow.dao.EventoDao;
import com.casadeshow.modelo.Evento;

@Controller
public class EventoController {

	@Autowired
	private EventoDao dao;
	
	@RequestMapping("/listaEventos")
	public String evento(Model model){
		List<Evento> eventos = dao.mostraEvento();
		model.addAttribute("eventos",eventos);
		return "listaEventos";
	}
	
}
