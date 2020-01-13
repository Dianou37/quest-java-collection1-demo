import java.util.ArrayList;
import java.util.Collections;

import java.util.List;



public class Thanos {
	// name: Black Widow, age: 34  
	// name: Captain America, age: 100  
	// name: Vision, age: 3  
	// name: Iron Man, age: 48  
	// name: Scarlet Witch, age: 29  
	// name: Thor, age: 1500
	// name: Hulk, age: 49  
	// name: Doctor Strange, age: 42

	public static void main(String[] args) {
		
		Hero black = new Hero("Black Widow",34);
		Hero captain = new Hero("Captain America",100);
		Hero vision = new Hero("Vision",3);
		Hero iron = new Hero("Iron Man",48);
		Hero scarlet = new Hero("Scarlet Witch",29);
		Hero thor = new Hero("Thor",1500);
		Hero hulk = new Hero("Hulk",49);
		Hero doctor = new Hero ("Doctor Stange",42);
		
		ArrayList<Hero> heroes = new ArrayList<>();
		heroes.add(black);
		heroes.add(captain);
		heroes.add(vision);
		heroes.add(iron);
		heroes.add(scarlet);
		heroes.add(thor);
		heroes.add(hulk);
		heroes.add(doctor);
		
		thor.setAge(1501);
		
		
		
		
		
		Collections.shuffle(heroes);
		
		
		
		
		
		List<Hero> thanosAttaque = heroes.subList(0, 4);
		System.out.println("Thanos a frappé");
		
		for (int i = 0; i < thanosAttaque.size(); i++) {
		    Hero hero = thanosAttaque.get(i);
		    System.out.println(hero.getName());
		}
		
		
		
		
	}

}
