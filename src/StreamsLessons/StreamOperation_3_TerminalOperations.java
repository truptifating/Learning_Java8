package StreamsLessons;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperation_3_TerminalOperations {

	public static void main(String[] args) 
	{
	
		//Constructor Referance
		/*
		 * List<String> names =Arrays.asList("A","B","C"); List<Mobilephone>
		 * mobilephonelist =
		 * names.stream().map(Mobilephone::new).collect(Collectors.toList());
		 */
		////Terminal Operations
		//1.Count
		List<String> list=Arrays.asList("Aakash","AKshit","Anurag","Ram");
		long result = list.stream().filter(x -> x.startsWith("A")).count();
		System.out.println(result);
		List<String> listname =list.stream().filter(x -> x.startsWith("A")).limit(2).collect(Collectors.toList());
		System.out.println(listname);
		
		//2.Collect
		List<String> listnameinCaps = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(listnameinCaps);
		
		//3.forEach
		list.stream().forEach(x -> System.out.println(x));
		
		//4.Combine Elements to produce single result
		List<Integer> list1= Arrays.asList(1,2,3,4);
		Optional<Integer> optionalInteger = list1.stream().reduce((x,y) -> x+y);
		System.out.println(optionalInteger.get());
		
		//5.anyMatch--used to check if any elements of a stream match a given predicate
		boolean anymatch = list.stream().anyMatch(x -> x.contains("Ram")); 
		System.out.println(anymatch);
		
		//6.allMatch-We pass Predicate as an argument to allMatch() method.
		//That Predicate is applied to each element of stream and if each and every element satisfies the given Predicate then it returns true otherwise false.
		
		boolean allmatch = list1.stream().allMatch(x -> x>0);
		System.out.println(allmatch);
		
		//7.NoneMatcch--It takes argument as a Predicate and if none of element of stream matches the given Predicate, then it returns true otherwise false.
		boolean nonematch = list1.stream().noneMatch(x -> x>0);
		System.out.println(nonematch);
		
		//8.findFirst-- finds the first element in a Stream. 
		System.out.println(list.stream().findFirst().get());
		
		//9.findAny
		System.out.println(list.stream().findAny().get());
		
		//Example-Filtering and Collecting names
		List<String> list3=Arrays.asList("Aakash","Akshit","Anurag","Ram");
		System.out.println(list3.stream().filter(x->x.length()>3).toList());
		
		//Example-Squaring and sorting
		List<Integer> list4= Arrays.asList(1,2,3,4);
		System.out.println(list4.stream().map(x -> x*x).sorted().toList());
		
		//Example-Counting Occurance of Character
		String sentence="Hello World";
		System.out.println(sentence.chars().filter(x ->x=='l').count());
//		sentence.chars()- will create the stream for characters
		
	}

	

}

