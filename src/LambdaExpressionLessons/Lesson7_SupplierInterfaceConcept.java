package LambdaExpressionLessons;

import java.util.function.Supplier;

public class Lesson7_SupplierInterfaceConcept 
{ 
	//Takes no argument and returns a result

	public static void main(String[] args) 
	{
		
		getText(() -> "Java");
		getText(() -> "Test Automation");
		

	}
	
	public static void getText(Supplier<String> text)
	{
		System.out.println(text.get());
		System.out.println(text.get().length());
	}

}
