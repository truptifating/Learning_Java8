package LambdaExpressionLessons;

import java.util.ArrayList;

public class Lesson8_ArrayListIterationWithLambdaExpression {

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("Nagpur");
		al.add("Pune");
		al.add("Mumbai");
		System.out.println("Printing array List---->>"+al);
		
		//Iterating array List with Lambda Expression
		System.out.println("Iterating through lamda expression-->>");
		al.forEach(city -> { System.out.println(city);} );
		
		//Iterating with for loop
		System.out.println("Iterating through for loop-->>");
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
