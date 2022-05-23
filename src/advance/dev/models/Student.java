package advance.dev.models;

public class Student extends Person{
	double mark;
	
	public Student(String name, int old, double mark) {
		super(name, old);
		this.mark = mark;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return String.format("name:%s - old:%d - mark:%.2f", name,old, mark);
	}
}
