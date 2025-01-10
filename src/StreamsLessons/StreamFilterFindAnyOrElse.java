package StreamsLessons;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) 
	{
		//List of Cuctomer Objects
		
		List<Customer> customerList=Arrays.asList(
				                  new Customer("Calfie", 10), //it will give this value to constructor which is created in Customer class
				                  new Customer("Tony", 35),
				                  new Customer("Ronnie", 10)
				);
		
		
        //1.Filter-findAny
		Customer customer= customerList.stream()     //Convert List to Stream
				.filter(x -> "Calfie".equals(x.getName()))   //Filter it for Calfie
				.findAny()                                   //if it finds then return
				.orElse(null);		
				System.out.println(customer.getName()+" "+customer.getAge());		
				System.out.println("------------");
		
		
		//2.Filter-DidNotFindAny---or Else
		Customer customer1= customerList.stream()     //Convert List to Stream
				.filter(x -> "Trupti".equals(x.getName()))   //Filter it for Calfie
				.findAny()                                   //if it finds then return
				.orElse(null);			
				System.out.println(customer1);
				System.out.println("------------");
				
		//3.Filter with Multiple Conditions
		Customer customer2 = customerList.stream()
				.filter((x)->"Ronnie".equals(x.getName()) && 10==x.getAge())
				.findAny()
				.orElse(null);
		        System.out.println(customer2.getName()+" "+customer2.getAge());
	}

}
