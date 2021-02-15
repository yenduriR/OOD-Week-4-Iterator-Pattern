package week4;

import java.util.Iterator;

/**
 * A class to iterate through subject list.
 * 
 * @author Ramadevi
 *
 */
public class SubjectIterator implements Iterator<Subject> {

	Subject[] subjects;
	int position = 0;

	/**
	 * Create a subject iterator.
	 * 
	 * @param subjects subjects
	 */
	public SubjectIterator(Subject[] subjects) {
		this.subjects = subjects;
	}

	/**
	 * Checks if the subject list has any more subjects.
	 * 
	 * @return boolean true or false
	 */
	@Override
	public boolean hasNext() {
		if (position >= subjects.length || subjects[position] == null) {
			return false;
		}

		return true;
	}

	/**
	 * Returns the next subject.
	 * 
	 * @return Subject
	 */
	@Override
	public Subject next() {
		Subject subject = subjects[position++];
		return subject;
	}

}
