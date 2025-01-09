package LambdaExpressionLessons;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Lesson3_BinaryOperatorInterfaceConcept 
{

	public static void main(String[] args) 
	{
		//Refer: https://devdocs.io/openjdk~8/java/util/function/binaryoperator
		
	/*	@FunctionalInterface
		public interface BinaryOperator<T>
		extends BiFunction<T,T,T> */
		
		//Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
		//This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
		
		BinaryOperator<Integer> func =(x1,x2) -> x1+x2;
		int result=func.apply(10, 20);
		System.out.println(result);
		
		//BiFunction
		BiFunction<Integer, Integer, Integer> func2=(x1,x2) ->x1+x2;
		int result2=func2.apply(20, 20);
		System.out.println(result2);

	}

}
