package LambdaExpressionLessons;


@FunctionalInterface  //Interface which have only one abstract method but other static and default methods are allowed//Introduce in JDK 1.8.1
public interface Page 
{
   public void m1();
   
   public static void m2()
   {}
   
   default void display()
   {}

   
}
