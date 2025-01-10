package LambdaExpressionLessons;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Lesson4_UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		//Refer:https://devdocs.io/openjdk~8/java/util/function/unaryoperator
		
	/*	@FunctionalInterface
		public interface UnaryOperator<T>
		extends Function<T,T> */
		
		//Represents an operation on a single operand that produces a result of the same type as its operand. 
		//This is a specialization of Function for the case where the operand and result are of the same type.
		UnaryOperator<Integer> func = x -> x*7;
		int result= func.apply(10);
		System.out.println(result);
		
		//Applying on ArrayList
		ArrayList<String> al= new ArrayList<String>();
		al.add("Java");
		al.add("Ruby");
		System.out.println(al);
	
		al.replaceAll(ele-> ele + "Language");
		System.out.println(al);
	
	
	
	}

}
