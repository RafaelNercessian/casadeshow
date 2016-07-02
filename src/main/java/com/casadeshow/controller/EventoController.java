package com.casadeshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.casadeshow.dao.EventoDao;
import com.casadeshow.modelo.Evento;

@Controller
public class EventoController {

	@Autowired
	private EventoDao dao;
	
	@RequestMapping("/listaEventos")
	public String evento(Model model){
		List<Evento> eventos = dao.listaEventos();
		model.addAttribute("eventos",eventos);
		return "listaEventos";
	}
	
	@RequestMapping("/listaEventos/detalhe/{id}")
	public String detalhe(@PathVariable Integer id,Model model){
		Evento buscaEvento = dao.buscaEvento(id);
		model.addAttribute("evento", buscaEvento);
		return "detalhe";
	}
	
	@RequestMapping("/adicionaEvento")
	public String adicionaEvento(Model model){
		Evento evento = new Evento();
		model.addAttribute("evento",evento);
		return "adicionaEvento";
	}
	
	@RequestMapping(value="/adiciona",method=RequestMethod.POST)
	public String adiciona(@ModelAttribute("evento") Evento evento){
		dao.adiciona(evento);
		return "redirect:/listaEventos";
	}
	
}
