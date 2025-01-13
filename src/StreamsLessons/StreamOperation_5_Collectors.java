package StreamsLessons;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation_5_Collectors {

	public static void main(String[] args) 
	{
		//1.Collecting to List
		List<String> names=Arrays.asList("Aakash","Akshit","Anurag","Ram","Anurag");
		List<String> namesList = names.stream().filter(name ->name.startsWith("A")).collect(Collectors.toList());
		System.out.println(namesList);

		//2.Collecting to Set
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,3,4);
		System.out.println(numbers.stream().collect(Collectors.toSet()));
		
		//3.Collecting to Specified Collection //We can convert to any collection
		ArrayList<String> li=names.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));
		System.out.println(li);
		
		//4.Joining Strings
		String concatenatedNames = names.stream().collect(Collectors.joining());
		System.out.println(concatenatedNames);
		
		String concatenatedNames1 = names.stream().collect(Collectors.joining(" "));
		System.out.println(concatenatedNames1);
		
		//5.Summarizing Data--Give Statistical Summary (count, sum, min, max, average)
		
		List<Integer> numbers1 = Arrays.asList(5,3,9,7,80);
		IntSummaryStatistics stats =numbers1.stream().collect(Collectors.summarizingInt(x ->x));
		System.out.println("Count-->"+stats.getCount());
		System.out.println("Sum-->"+stats.getSum());
		System.out.println("Max-->"+stats.getMax());
		System.out.println("Min-->"+stats.getMin());
		System.out.println("Average-->"+stats.getAverage());
		
		//to get average directly
		Double average = numbers1.stream().collect(Collectors.averagingInt(x -> x));
		System.out.println("Average-->"+average);
		
		//6 Counting Elements		
		Long count = numbers1.stream().collect(Collectors.counting());
		System.out.println("Count-->"+count);
		
		//7.Grouping Elements
		List<String> words = Arrays.asList("hello","world","java","Streams","Collection");
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
		System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));//printing with Method Referance
		System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" "))));
		System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
		
		//8.Partitioning Elements
		//Partition elements in 2 group (true and false) based on predicate
		System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>5)));
		
		//9.Mapping and Collecting
		//Applies a mapping function before collecting
		System.out.println(words.stream().collect(Collectors.mapping(x ->x.toUpperCase(), Collectors.toList())));
		
		//10.Creating a Map from Stream Elements
		List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
		System.out.println(fruits.stream().collect(Collectors.toMap(x ->x.toUpperCase(), x ->x.length())));
		
		//Example-1
		
		
	}

}
