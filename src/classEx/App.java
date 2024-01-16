package classEx;

public class App {

	public static void main(String[] args) {

		Person people = new Person("Liam", 30, "Banking", "Sunderland");

		people.intro();
		people.setName("Liam");
		people.setAge(30);
		people.setJob("Banking");
		people.setLocation("Sunderland");
		people.print();

		Person people2 = new Person("Robyn", 31, "Mortgages", "Sunderland");
		people2.intro();
		people2.setName("Robyn");
		people2.setAge(31);
		people2.setJob("Mortgages");
		people2.setLocation("Sunderland");
		people2.print();

		Person people3 = new Person("Bobby", 43, "Teacher", "Scotland");
		people3.intro();
//		people3.setName("Bob");
//		people3.setAge(43);
//		people3.setJob("Teacher");
//		people3.setLocation("Aberdeen");
		people3.print();
		
		Person people4 = new Person("Kevin", 69, "Retired", "South Shields");
		people4.intro();
		people4.print();

		Person people5 = new Person("Bob", "FBI", 50000);
		people5.printSalary();

		Person people6 = new Person("Steve", "Jobs", 120.65);
		people6.printWage();

		Person[] persons = { people, people2, people3, people4 };
		for (Person person : persons) {
			person.print();
		
	}

}
}
