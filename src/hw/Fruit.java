package hw;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
	
	public Fruit(String name) {
		super();
		this.name = name;
	}

	private static List <Fruit> fruit = new ArrayList<>(List.of(
			new Fruit ("strawberry"), 
			new Fruit ("apple"), 
			new Fruit ("watermelon"), 
			new Fruit ("banana")));
	
	public String name;
	

	
	
	public String toString() {
		return name + " fruit";
	}
	
	

	public String getName() {
		return name;
	}

	public static List<Fruit> getFruit(){
		return new ArrayList<>(fruit);
	}
	
	
	public static int compare(Fruit f1, Fruit f2) {
		if (f1.getName().length() < f2.getName().length()) {
			return -1;
		} else if (f1.getName().length() > f2.getName().length()) {
			return 1;
		} else { // Why was an else if here not working before?
			return 0;
		}
	}
	}
	


