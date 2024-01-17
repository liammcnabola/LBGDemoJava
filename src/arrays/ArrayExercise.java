package arrays;

public class ArrayExercise {
public static void main(String[] args) {
	
	int [] nums = {1,2,3,4,5,6,7,8,9,10}; 
		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + "Num: " + nums [i]);
	}
	for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] *10;
			System.out.println("x10: "+ nums[i]);
	}
	
	for (int i = 0; i < nums.length; i++) {
		
	}
	
	for (int i = 0; i < nums.length; i++) {
		if (i%3==0 && i%5==0) {System.out.println("FizzBuzz");
			} else if (i%3==0) {System.out.println("Fizz");
				} else if (i%5==0) {System.out.println("Buzz");
					} else System.out.println((i));
		
 int [] nums2 = {11, 23, 45, 65, 49, 32, 88}; 
 for (int j = 0; j < nums2.length; j++) {
	 System.out.println("J:  " + j + "Num:  " + nums2[j]);
}
}}}
