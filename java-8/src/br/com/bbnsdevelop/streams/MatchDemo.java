package br.com.bbnsdevelop.streams;

import java.util.function.Predicate;

import br.com.bbnsdevelop.services.student.Student;
import br.com.bbnsdevelop.services.student.StudentService;

public class MatchDemo {

	public static void main(String[] args) {
		StudentService service = new StudentService();

		Predicate<Student> predicate = s -> s.getNote() >= 6;
		Predicate<Student> disapproved = predicate.negate();
		
		boolean allMatch = service.getStudents().stream().allMatch(predicate);		
		System.out.println(allMatch);
		
		boolean anyMatch = service.getStudents().stream().anyMatch(predicate);		
		System.out.println(anyMatch);
		
		boolean noneMatch = service.getStudents().stream().noneMatch(predicate);
		System.out.println(noneMatch);
		
		
		boolean negate = service.getStudents().stream().noneMatch(disapproved);
		System.out.println(negate);
	}
}
