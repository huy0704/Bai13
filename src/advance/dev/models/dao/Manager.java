package advance.dev.models.dao;

import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Person;
import advance.dev.models.Student;
import advance.dev.models.Teacher;

public class Manager implements IManager {
private List<Person> personList = new ArrayList<Person>();
	@Override
	public void add(Person p) {
		// TODO Auto-generated method stub
		personList.add(p);
		System.out.println(p);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Person person : personList) {
			System.out.println(person);
			
		}
		
	}

	@Override
	public void findExcellentStudents() {
		// TODO Auto-generated method stub
		Student exc = null;
		for(Person person : personList) {
			if(person instanceof Student) {
				Student std = (Student) person;
				if(exc == null) exc = std;
				else {
					if(std.getMark()> exc.getMark())
						exc = std;
				}
			}
			
		}
		System.out.println(exc);
	}

	@Override
	public void findExcellentTeacher() {
		// TODO Auto-generated method stub
		Teacher exc = null;
		for (Person person : personList) {
			if(person instanceof Teacher) {
				Teacher teacher = (Teacher) person;
					if(exc == null) exc = teacher;
					else {
						if(teacher.getSalary() > exc.getSalary())
							exc = teacher;
			}
		
				}
			}
		System.out.println(exc);
}
}
