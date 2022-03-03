package hw;

import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
	
		
	
	String fruits = Fruit.getFruit().stream()//create a stream from the list of objects
		.map((fruit) -> fruit.toString())	//the the stream to a stream of strings
		.sorted()							//sort the stream in natrual order
		.collect(Collectors.joining(", "));	//collect the stream and retrun comma separated.
	
	System.out.println(fruits);				//print the string
	
	
}
}