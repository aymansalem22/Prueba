package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Hero;
import com.example.demo.repository.HeroRepository;

@RestController
public class HeroController {

	@Autowired
	private HeroRepository repository;
	
	@GetMapping("/heros")
	public List<Hero> recuperarHeros() {
		return repository.findAll();
	}
	
	@GetMapping("/heros/{id}")
	public Hero recuperarHero(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/heros")
	public Hero crearHero(@RequestBody Hero hero) {
		return repository.save(hero);
	}
	
	@PutMapping("/heros")
	public Hero editarHero(@RequestBody Hero hero) {
		return repository.save(hero);
	}
	
	@DeleteMapping("/heros/{id}")
	public void borrarHero(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@DeleteMapping("/heros")
	public void borrarHeros() {
		repository.deleteAll();
	}
	
	
	
}
