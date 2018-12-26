package com.utn.jpy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.jpy.DAO.PokemonDAOImpl;
import com.utn.jpy.beans.Pokemon;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonDAOImpl pokemonDAOImpl;
	
	@RequestMapping ("/pokemon")
	public Pokemon getAllPOkemons(){
		return pokemonDAOImpl.buscarPokemon(null);
		
		
		
	}
}
