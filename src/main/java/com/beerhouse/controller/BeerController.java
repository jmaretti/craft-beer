/**
 * 
 */
package com.beerhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beerhouse.entity.Beer;
import com.beerhouse.repository.BeerRepository;

/**
 * Classe responsável por fornecer os serviços do
 * crud de cerveja
 * @author Jefferson
 *
 */
@RestController
@RequestMapping("/api")
public class BeerController {

	@Autowired
	private BeerRepository repository;
	
	/**
	 * recupera lista de cervejas
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Beer> getBeerList(){
		
		return repository.findAll();
	}
	
	/**
	 * cadastra uma nova cerveja
	 * @param beer
	 */
	
	@RequestMapping(path="/save" ,method=RequestMethod.POST, consumes = "application/json")
	public void save(@RequestBody Beer beer) {
		
		repository.save(beer);
	}
	
	
	/**
	 * remove uma cerveja dos cadastros
	 * @param id
	 */
	@RequestMapping(value="/delete", method=RequestMethod.DELETE, consumes = "application/json")
	public void delete(@RequestBody Beer beer) {
		
		repository.delete(beer);
	}
	
	/**
	 * atualiza cadastro da cerveja
	 * @param beer
	 */
	@RequestMapping(value="/update",method=RequestMethod.PUT, consumes = "application/json")
	public void update(@RequestBody Beer beer) {
		
		repository.saveAndFlush(beer);
		
		
	}
	
}
