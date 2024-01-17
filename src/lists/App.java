package lists;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		words.add("!");

		words.remove("!");
		System.out.println(words);

		// never modify a list as you're looping over it.
		// array.length is now array.size


		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			nums.add(i * 2);
		}
		System.out.println(nums);

		// for Array Lists, do not loop through with primitives, instead of 'int' use
		// 'Integer'

		for (Integer num : nums) {
			System.out.println("Num:  " + num);
		}

	}

}
