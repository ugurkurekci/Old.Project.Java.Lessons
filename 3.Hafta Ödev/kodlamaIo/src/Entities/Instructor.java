package Entities;

public class Instructor extends User {
	private String Image;
	private String about;

	public Instructor(int id, String firstName, String lastName, String email, String password, String courses,
			String image, String about) {
		super(id, firstName, lastName, email, password, courses);
		Image = image;
		this.about = about;
	}

	public Instructor() {
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
