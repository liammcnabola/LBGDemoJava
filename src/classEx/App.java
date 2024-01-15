package classEx;

public class App {

	public static void main(String[] args) {

		Person people = new Person();

		people.intro();
		people.name = "Liam";
		people.age = 30;
		people.job = "Banking";
		people.location = "Sunderland";
		people.print();

		Person people2 = new Person();
		people2.intro();
		people2.name = "Robyn";
		people2.age = 31;
		people2.job = "Mortgages";
		people2.location = "Sunderland";
		people2.print();

		Person people3 = new Person();
		people3.intro();
		people3.name = "Bob";
		people3.age = 43;
		people3.job = "Teacher";
		people3.location = "Aberdeen";
		people3.print();
		
		Person[] persons = { people, people2, people3 };
		for (Person person : persons) {
			person.print();
		
	}

}
}
