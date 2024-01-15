package oop;

public class App {

	public static void main(String[] args) {

		cat moggy = new cat();

		moggy.name = "Tiddles";
		moggy.breed = "Persian";
		moggy.age = 12;
		moggy.colour = "Blonde";

		System.out.println(moggy.name);
		System.out.println(moggy.breed);
		System.out.println(moggy.age);
		System.out.println(moggy.colour);
		moggy.sleep();

	}
	

	}


