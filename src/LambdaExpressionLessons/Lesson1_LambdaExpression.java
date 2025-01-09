package LambdaExpressionLessons;

public class Lesson1_LambdaExpression {

	public static void main(String[] args) {
		
		WebPage w1=(value)-> {System.out.println("hi "+value);};  //Lmabda is nothing but the body of method
		
		//removing brackets
		WebPage w2=(value)-> System.out.println("hi "+value);
		
		//passing different variable
		WebPage w3=(name)-> System.out.println(name.toUpperCase());
		
		
		WebPage w4=(name)-> System.out.println(name.length());
		w1.header("google");
		w2.header("facebook");
		w3.header("trupti");
		w4.header("trupti");
		
		
		/*
		 * WebPage w1= new WebPage() {
		 * 
		 * @Override public void header(String value) { System.out.println("hi "+value);
		 * 
		 * } };
		 * 
		 * WebPage w2= new WebPage() {
		 * 
		 * @Override public void header(String value) { System.out.println("hi "+value);
		 * 
		 * } }; w1.header("google"); w2.header("facebook");
		 */
	}

}
