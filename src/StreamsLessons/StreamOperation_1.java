package StreamsLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation_1 {

	public static void main(String[] args) 
	{
		/*
		List<Integer> list = Arrays.asList(1,2,6,3,9,12,56,89,345);
		List<Integer> filterdList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList()); //Filtering the even no
		System.out.println(filterdList);
		
		List<Integer> mappedList = filterdList.stream().map(x -> x/2).collect(Collectors.toList());
		System.out.println(mappedList);
		*/
		
		//Putting upper both function in one line
		
		List<Integer> list1 = Arrays.asList(1,2,6,3,9,12,56,89,345,0,1,2,3);
		List<Integer> newList= list1.stream()
									.filter(x -> x%2 == 0)      //filter the even no																	
									.map(x -> x/2)              //will divide all the even no by 2
									.distinct()                 // to avoid duplicate values									
									.sorted()                   // sort the no in ascending order
									.collect(Collectors.toList()); //collect the no in list
									System.out.println(newList);
									System.out.println("-----------------");
									
		List<Integer> list2 = Arrays.asList(134,2462,6,3,9,12,56,89,345,0,1,2,3);
		List<Integer> newList1= list2.stream()
									 .filter(x -> x%2 == 0)      //filter the even no
									 .map(x -> x/2)              //will divide all the even no by 2
									 .distinct()                 // to avoid duplicate values
									 .sorted((a,b)->(b-a))       // sort the no in Descending order
									 .limit(3)                   //it will give only 3 starting element
									 .skip(1)                    //it will skip 1 element
									 .collect(Collectors.toList()); //collect the no in list
									 System.out.println(newList1);
									 
							 
	}

}
