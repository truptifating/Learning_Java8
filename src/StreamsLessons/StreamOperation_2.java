package StreamsLessons;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation_2 {

	public static void main(String[] args) {
		List<Integer> list3 = Stream
        							.iterate(0, x -> x+1)  //it will take the no from 0 and increment the no with 1 
        							.limit(10)             //the limit is 10 so will print no from 0 to 9
        							.peek(x -> System.out.println(x))
        							.skip(1)               // skipping the first no means 0 so it will print from 1 to 9
        							.collect(Collectors.toList());	
		System.out.println(list3);
		System.out.println("--------------");
		
		//Terminal Operation--->>Min,Max,Count
                
		Integer  value1 = Stream
                				.iterate(0, x -> x+1)
                				.limit(10)
                				.map(x -> x/2)
                				.distinct()               							
                				.max((a,b) -> b-a)
                				.get();
        System.out.println(value1);
        System.out.println("--------------");
        
        Integer  value2 = Stream
						        .iterate(0, x -> x+1)
						        .limit(10)
						        .map(x -> x/2)
						        .distinct()					
						        .max((a,b) -> a-b)
						        .get();
        System.out.println(value2);
        System.out.println("--------------");
        
        Long  value3 = Stream
						    .iterate(0, x -> x+1)
						.limit(10)
						.map(x -> x/2)
						.distinct()					
						.count();
						
System.out.println(value3);

	}

}
