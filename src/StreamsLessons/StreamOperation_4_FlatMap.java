package StreamsLessons;

import java.util.Arrays;
import java.util.List;

public class StreamOperation_4_FlatMap {

	public static void main(String[] args) 
	{
		//Example--1
		List<List<String>> fruitsList = Arrays.asList(
				Arrays.asList("apple","banan"),
				Arrays.asList("orange","kiwi"),
				Arrays.asList("pear","grapes")
				);
		
		System.out.println(fruitsList);
		System.out.println(fruitsList.get(1).get(1));
		
		//Using Method reference
		System.out.println(fruitsList.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());//converted to single array
		
		//OR
		
		//Using Lambda Expression
		System.out.println(fruitsList.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).toList());
		
		//Example--2
		List<String> sentence = Arrays.asList("Hello World", "Java Streams are powerfull", "FlatMap is usefull");
		System.out.println(sentence.stream().flatMap(x ->Arrays.stream(x.split(" "))).toList());
	}

}
