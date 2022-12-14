package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Hero;

public class MockData {
	public static Hero getHero() {
		Hero hero = new Hero();
		hero.setId(1L);
		hero.setName("Raul");
		return hero;
		}
	
	public static Hero updategetHero() {
		Hero hero = new Hero();
		hero.setId(MockData.getHero().getId());
		hero.setName("Raul");
		return hero;
	}
	


	public static List<Hero> getHeroList() {
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(getHero());
		heros.add(getHero());
		return heros;
	}
	
	
}
