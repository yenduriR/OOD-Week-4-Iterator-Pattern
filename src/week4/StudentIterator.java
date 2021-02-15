package week4;

import java.util.Iterator;

/**
 * A class to iterate through student list.
 * 
 * @author Ramadevi
 *
 */
public class StudentIterator implements Iterator<Student> {

	Student[] students;
	int position = 0;

	/**
	 * Create a student iterator.
	 * 
	 * @param students
	 */
	public StudentIterator(Student[] students) {
		this.students = students;
	}

	/**
	 * Checks if the student list has any more students.
	 * 
	 * @return boolean true or false
	 */
	@Override
	public boolean hasNext() {
		if (position >= students.length || students[position] == null) {
			return false;
		}

		return true;
	}

	/**
	 * Returns the next student.
	 * 
	 * @return Student
	 */
	@Override
	public Student next() {
		Student student = students[position++];
		return student;
	}

}
