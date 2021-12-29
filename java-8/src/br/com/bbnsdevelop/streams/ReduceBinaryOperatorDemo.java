package br.com.bbnsdevelop.streams;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.bbnsdevelop.services.student.Average;
import br.com.bbnsdevelop.services.student.Student;
import br.com.bbnsdevelop.services.student.StudentService;

public class ReduceBinaryOperatorDemo {
	
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		Predicate<Student> predicate = s -> s.getNote() >= 6;
		
		Function<Student, Double> function = s -> s.getNote();		
		BiFunction<Average, Double, Average> calc = (average, note) -> average.add(note);
		BinaryOperator<Average> match = (m1, m2) -> Average.compose(m1, m2);
		Consumer<Average> consumer = a -> System.out.println(String.format("The average of those who pass the class is: %.2f", a.getAverage()));
		
		Average average = service.getStudents().stream().filter(predicate).map(function).reduce(new Average(), calc, match);
		consumer.accept(average);
	}

}
