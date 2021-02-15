package week4;

import java.util.Iterator;

/**
 * A class representing a Student.
 * 
 * @author Ramadevi
 *
 */
public class Student {

	private String name;
	private Subject[] subjects;
	private int numSubjects;
	private int MAX = 3;

	/**
	 * Create student.
	 * 
	 * @param name name of the student
	 */
	public Student(String name) {
		this.name = name;
		this.subjects = new Subject[MAX];
		this.numSubjects = 0;
	}

	/**
	 * Returns name of the student.
	 * 
	 * @return name of the student.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name of the student
	 * 
	 * @param name name of the student
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Add subject for the student.
	 * 
	 * @param name name of the subject
	 */
	public void addSubject(String name) {
		if (numSubjects >= MAX) {
			System.out.println("No more subjects can be added");
			return;
		}

		subjects[numSubjects++] = new Subject(name);
	}

	/**
	 * Returns subject iterator.
	 * 
	 * @return subject iterator
	 */
	public Iterator<Subject> createIterator() {
		return new SubjectIterator(subjects);
	}

}
