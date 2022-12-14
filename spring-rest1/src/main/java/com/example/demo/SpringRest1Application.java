package com.example.demo;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Hero;
import com.example.demo.repository.HeroRepository;

@SpringBootApplication
public class SpringRest1Application implements CommandLineRunner{

	@Autowired
	private HeroRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRest1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hero hero1 = new Hero(1L,"ALAN");
		Hero hero2 = new Hero(2L,"David");
		Hero hero3 = new Hero(3L,"Ana");

		
		
		
		Hero hero4 = new Hero(4L,"Test");
		repository.saveAll(Arrays.asList(hero1, hero2, hero3,hero4));
		//repository.deleteById(4L);
		Optional<Hero> herot=repository.findById(1L);
		Hero h=herot.get();
		h.setName("AlanTest");
		repository.save(h);
		
		
	}

}
