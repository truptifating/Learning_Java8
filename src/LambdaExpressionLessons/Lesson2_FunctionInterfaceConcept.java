package LambdaExpressionLessons;

import java.util.function.Function;

public class Lesson2_FunctionInterfaceConcept {

	public static void main(String[] args) {
		
		//Function Interface
		Function<String, Integer> func = x-> x.length();//Input is string and output is integer
		int len=func.apply("Hi Google");
		System.out.println(len);
		//Note-- In function we have only one apply method
		
		//Chaining Function
		Function<Integer,Integer> func2 = x->x*2;
		int result=func.andThen(func2).apply("Hi Facebook"); //string Hi Facebook will given to func first and then func2 will apply
		System.out.println(result);
	}

}
