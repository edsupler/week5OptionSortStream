package hw;

import java.util.List;

public class Sorts {

	public static void main(String[] args) {

		
		System.out.println(Fruit.getFruit());  // original list for reference

		System.out.println(sortFruitLambda(Fruit.getFruit()));

		System.out.println(sortFruitMethodRef(Fruit.getFruit()));

		
	}
	
	public static List<Fruit> sortFruitLambda(List<Fruit> fruit) { 
		fruit.sort(
		(f1, f2) -> Fruit.compare (f1,f2));
		return fruit;
	}
	
	public static List<Fruit> sortFruitMethodRef(List<Fruit> fruit) { 
		fruit.sort(Fruit::compare);
		
		return fruit;

}
}