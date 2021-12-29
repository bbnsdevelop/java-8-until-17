package br.com.bbnsdevelop.services.student;

import java.util.Arrays;
import java.util.List;

public class StudentService {

	private List<Student> list;

	public StudentService() {
		list = Arrays.asList(new Student(), new Student("John", 8.5), new Student("Ana", 6.0),
				new Student("Felix", 10.0), new Student("Reese", 10.0), new Student("Philipe", 5.0),
				new Student("Mika", 7.5), new Student("Mia", 6.5), new Student("Luna", 7.77));
	}

	public List<Student> getStudents() {
		return list;
	}

}
