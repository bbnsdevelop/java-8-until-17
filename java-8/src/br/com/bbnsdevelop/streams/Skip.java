package br.com.bbnsdevelop.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.bbnsdevelop.services.student.Student;
import br.com.bbnsdevelop.services.student.StudentService;

public class Skip {

	public static void main(String[] args) {
		StudentService service = new StudentService();

		List<Student> list1 = new ArrayList<>(service.getStudents());
		List<Student> list = new ArrayList<>(service.getStudents());

		list1.addAll(list);

		Consumer<Student> consumer = s -> System.out.println(s);

		list1.stream().distinct().skip(4).forEach(consumer);
	}

}
