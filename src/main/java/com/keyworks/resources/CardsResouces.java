package com.keyworks.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.keyworks.domain.Cards;

@RestController
@RequestMapping(value = "/cards")
public class CardsResouces {

	@RequestMapping(method = RequestMethod.GET)
	public List<Cards> listar() {
		
		
		Cards cads1 = new Cards(null, "Matheus", "Java", "fazer um projeto em java", "em andamento", null);
		Cards cads2 = new Cards(null, "Ana", "PHP", "fazer um projeto em PHP", "atrasado", null);
		
		List<Cards> lista = new ArrayList<>();
		lista.add(cads1);
		lista.add(cads2);
		
		
		return lista;
	}
	
	
}
