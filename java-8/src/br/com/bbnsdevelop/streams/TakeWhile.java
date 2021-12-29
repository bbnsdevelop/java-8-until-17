package br.com.bbnsdevelop.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import br.com.bbnsdevelop.services.student.Student;
import br.com.bbnsdevelop.services.student.StudentService;

public class TakeWhile {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		Predicate<Student> predicate = s -> s.getNote() >= 7;

		List<Student> list1 = new ArrayList<>(service.getStudents());
		List<Student> list = new ArrayList<>(service.getStudents());

		list1.addAll(list);

		Consumer<Student> consumer = s -> System.out.println(s);

		list1.stream().distinct().skip(1).takeWhile(predicate).forEach(consumer);
	}

}
