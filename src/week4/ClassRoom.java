package week4;

import java.util.Iterator;

/**
 * A class representing a classroom.
 * 
 * @author Ramadevi
 *
 */
public class ClassRoom {

	private Student[] students;
	private int numStudents;
	private int MAX = 10;

	/**
	 * Create a classroom.
	 */
	public ClassRoom() {
		numStudents = 0;
		students = new Student[MAX];
	}

	/**
	 * Add a student to the classroom.
	 * 
	 * @param student Student
	 */
	public void addStudent(Student student) {
		if (numStudents >= MAX) {
			System.out.println("No more students can be added");
			return;
		}

		students[numStudents++] = student;
	}

	/**
	 * Return student iterator.
	 * 
	 * @return student iterator
	 */
	public Iterator<Student> createIterator() {
		return new StudentIterator(students);
	}

}
