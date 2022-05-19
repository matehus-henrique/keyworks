package com.keyworks.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.keyworks.domain.Cards;
import com.keyworks.dto.CardsDTO;
import com.keyworks.service.CardsService;

@RestController
@RequestMapping(value = "/cards")
public class CardsResouces {

	@Autowired
	private CardsService service;
	
	//
	@RequestMapping(value = "/{id}",method =  RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Cards> obj = service.find(id);
		
	return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CardsDTO objDto){
		Cards obj = service.fromDTo(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();

	}
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody CardsDTO objDto, @PathVariable Integer id){
		Cards obj = service.fromDTo(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

	//listando os todos os cards 
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CardsDTO>> findAll(){
		List<Cards> list = service.findAll();
		List<CardsDTO> listDto = list.stream().map(obj -> new CardsDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	//listando os todos os cards  com pege 

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<CardsDTO>> findPage(
		@RequestParam(value = "page", defaultValue = "0")Integer page,
		@RequestParam(value = "linesPerPage", defaultValue = "24")Integer linesPerPage,
		@RequestParam(value = "orderBy", defaultValue = "nome")String orderBy,
		@RequestParam(value = "direction", defaultValue = "ASC")	String direction){
		Page<Cards> list = service.findPage(page, linesPerPage, orderBy, direction);
		Page<CardsDTO> listDto = list.map(obj -> new CardsDTO(obj));
		return ResponseEntity.ok().body(listDto);
	}
	
	
	
}
