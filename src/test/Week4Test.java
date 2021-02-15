package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week4.ClassRoom;
import week4.Student;
import week4.Subject;


class Week4Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUp() throws Exception {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void test() throws IOException {
		
		Student john = new Student("John");
		john.addSubject("Maths");
		john.addSubject("Science");
		john.addSubject("English");
		
		// test max subject limit
		john.addSubject("Drawing");
		assertEquals("No more subjects can be added" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		Student jack = new Student("Jack");
		jack.addSubject("English");
		jack.addSubject("Drawing");
		
		Student peter = new Student("Peter");
		peter.addSubject("Science");
		peter.addSubject("Maths");
		
		ClassRoom classroom = new ClassRoom();
		classroom.addStudent(john);
		classroom.addStudent(jack);
		classroom.addStudent(peter);
		
		Iterator<Student> studentIterator = classroom.createIterator();
		Iterator<Subject> subjectIterator;
		Student student;
		Subject subject;
		
		// first student
		student = studentIterator.next();
		assertEquals("John", student.getName());

		// first student - subjects
		subjectIterator = student.createIterator();
		assertEquals("Maths", subjectIterator.next().getName());
		assertEquals("Science", subjectIterator.next().getName());
		assertEquals("English", subjectIterator.next().getName());
		
		// second student
		student = studentIterator.next();
		assertEquals("Jack", student.getName());

		// second student - subjects
		subjectIterator = student.createIterator();
		assertEquals("English", subjectIterator.next().getName());
		assertEquals("Drawing", subjectIterator.next().getName());

		// third student
		student = studentIterator.next();
		assertEquals("Peter", student.getName());

		// third student - subjects
		subjectIterator = student.createIterator();
		assertEquals("Science", subjectIterator.next().getName());
		assertEquals("Maths", subjectIterator.next().getName());
				
	}

}
