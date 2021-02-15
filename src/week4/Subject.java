package week4;

/**
 * A class representing a Subject.
 * 
 * @author Ramadevi
 *
 */
public class Subject {

	private String name;

	/**
	 * Create a subject.
	 * 
	 * @param name name of the subject
	 */
	public Subject(String name) {
		this.name = name;
	}

	/**
	 * Returns name of the subject.
	 * 
	 * @return name of the subject
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name of the subject.
	 * 
	 * @param name name of the subject
	 */
	public void setName(String name) {
		this.name = name;
	}

}
