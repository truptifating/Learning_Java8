package StreamsLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) 
	{
		//Note- Stream is the sequence of elements
		//List Declaration
		List<String> list=Arrays.asList("apple","banana","grapes");
		System.out.println(list);
		
		//Converting list to stream
		Stream<String> mystream=list.stream();
		
		//Array Declaration
		String []fruits= {"apple","banana","grapes"};
		
		//Converting Array to Stream
		Stream<String> mystream1=Arrays.stream(fruits);
		
		Stream<Integer> intgerstream = Stream.of(1,2,3);
		
		//Generating stream in range
		Stream<Integer> limit1 = Stream.iterate(0, n -> n+1).limit(6);
		
		Stream<String> limit2=Stream.generate(()->"hello").limit(5);
		
		
	}

}
