package hw;

import java.util.NoSuchElementException;
import java.util.Optional;

public class FruitOptional {
	public static void main(String[]args) {
		new FruitOptional().run();
		
		
		
		
		
	}
	
	private void run() {
		Fruit fruit = fruitMethod(Optional.of(new Fruit("Olive")));
		System.out.println(fruit);
		
		try {
		fruitMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

	private Fruit fruitMethod(Optional<Fruit> optionalFruit) {
		return optionalFruit.orElseThrow(() -> new NoSuchElementException("Not a Fruit!!!!"));
	}
}
