package LambdaExpressionLessons;

//SAM-->> Single abstract methods

@FunctionalInterface  //Interface which have only one abstract method but other static and default methods are allowed//Introduce in JDK 1.8.1
public interface WebPage 
{
   void header(String value);//we can pass multiple parameter but we cannot create multiple method
}
