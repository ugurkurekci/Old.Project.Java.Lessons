package Entities;

public class Student extends User {
	private String comment;

	public Student(int id, String firstName, String lastName, String email, String password, String courses,
			String comment) {
		super(id, firstName, lastName, email, password, courses);
		this.comment = comment;
	}

	public Student() {
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
