package classEx;

public class Person {

	private String name;
	private int age;
	private String job;
	private String location;
	private String forename;
	private String surname;
	private int salary;
	private double wage;

	public Person(String name, int age, String job, String location) {
		this.name = name;
		setAge(age);
		this.job = job;
		this.location = location;
	}

	public Person(String name, String job, int salary) {
		this.name = name;
		this.job = job;
		this.salary = salary;

	}

	public Person(String forename, String surname, double wage) {
		this.forename = forename;
		this.surname = surname;
		setWage(wage);
	}

	void print() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Job:  " + job);
		System.out.println("Location: " + location);
	}

	void printSalary() {
		System.out.println("Name: " + name);
		System.out.println("Job:  " + job);
		System.out.println("Salary:  " + salary);
	}

	void printWage() {
		System.out.println("Forename:  " + forename);
		System.out.println("Surname:  " + surname);
		System.out.println("Wage:  " + wage);
	}

	void intro() {
		System.out.println("Hello! My information is as follows...");
	}

	// Setters:

	public void setWage(double wage) {
		if (wage >= 0 && wage < 1500.50) {
			this.wage = wage;
		} else {
			System.out.println("Please enter a valid hourly wage");
		}
	}

	// Getters:

	public double getWage() {
		return wage;
	}

	// Setters (continued):

	public void setAge(int age) {
		if (age >= 0 && age < 110) {
			this.age = age;
		} else {
			System.out.println("Please provide a valid age");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setLocation(String location) {
		this.location = location;
	};

	// Getters:

	public int getAge() {
		return this.age;
	};

	public String getName() {
		return name;
	};

	public String getJob() {
		return job;
	};

	public String getLocation() {
		return location;
	};

}
