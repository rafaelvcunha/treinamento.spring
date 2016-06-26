package br.com.accesstage.treinamento.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.accesstage.treinamento.spring.service.UsuarioService;

@Controller
public class MainController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String teste() {
		return "teste";
	}
	
	@RequestMapping(value="/usuarios",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView listar(ModelAndView model) {
		model.setViewName("listaUsuarios");
		model.addObject("listaUsuarios", usuarioService.listar());
		return model;
	}
}
