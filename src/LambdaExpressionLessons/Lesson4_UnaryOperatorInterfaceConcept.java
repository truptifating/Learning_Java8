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
		
		//Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
		//This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
	
		UnaryOperator<Integer> func = x -> x*7;
		int result= func.apply(10);
		System.out.println(result);
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Java");
		al.add("Ruby");
		System.out.println(al);
	
		al.replaceAll(ele-> ele + "Language");
		System.out.println(al);
	
	
	
	}

}
