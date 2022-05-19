package advance.dev.models;

public class Teacher extends Person {
	public Teacher(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}

	double salary;
	public Teacher(String name, int old, double salary) {
		super(name, old);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("name:%s - salary:%.2f", name, salary);

	
}
}
