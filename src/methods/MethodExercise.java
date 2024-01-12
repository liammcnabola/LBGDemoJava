package methods;

public class MethodExercise {

	public static void main(String[] args) {
	
		System.out.println(add (12,24));
		System.out.println(minus (10,2));
		System.out.println(multiply (10,5));
		System.out.println(divide (50,5));
}

	public static int add (int a, int b) { return a+b;} 
	public static int minus (int a, int b) {return a-b;}
	public static double multiply (double a, double b) {return a*b;} 
	public static double divide (double a, double b) {return a/b;} 
	
}
