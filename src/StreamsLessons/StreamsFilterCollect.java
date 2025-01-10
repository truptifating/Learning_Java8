package StreamsLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) 
	{
		List<String> cityList= Arrays.asList("Nagpur","Pune","Mumbai","Banglore");
		System.out.println("Printing List-->>"+cityList);    //Printing List	
		cityList.forEach(ele -> System.out.println(ele)); //Iterating with Lambda Expression and then printing
		
		System.out.println("After Filtering");

		List<String> finalresult = cityList.stream()                                        //Converting List to Stream
				                                   .filter(ele -> !ele.equals("Banglore"))  //Filtering the result
				                                   .collect(Collectors.toList());           //Collecting the result
		
//		List<String> finalresult = cityList.stream().filter(ele -> !ele.equals("Banglore")).collect(Collectors.toList());                                      

                          
		finalresult.forEach(ele -> System.out.println(ele)); //Iterating with Lambda Stream
		finalresult.forEach(System.out::println); //Iterating with method referance
	}

}
