package com.keyworks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.keyworks.domain.Cards;
import com.keyworks.dto.CardsDTO;
import com.keyworks.repositories.CardsRepository;
import com.keyworks.service.exceptions.ObjectNotFoundException;

@Service
public class CardsService {

	
	@Autowired
	private CardsRepository repo;
	
	public Optional<Cards> find(Integer id) {
		Optional<Cards> obj = repo.findById(id);
		if (obj == null) {
		 throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
		 + ", Tipo: " + Cards.class.getName());
		 }
		return obj;
		}
	
//função para para insirir os Cards

	public Cards insert(Cards obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	//função para para atualizar os Cards
	public Cards update(Cards obj ) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	//função para para listar os Cards

	public List<Cards> findAll(){
		return repo.findAll();
	}
	
	//função para para listar em paginação do banco de dados os Cards

	public Page<Cards> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	//Serviço de validação de Bean Validation
	public Cards fromDTo(CardsDTO objDto) {
		return new Cards(objDto.getId(), objDto.getNome(),objDto.getProjeto(), null, null, null);
	}
	
	
}
