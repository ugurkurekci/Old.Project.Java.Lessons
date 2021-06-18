package Entities;

public class Course {

	public Course(int id, String name, String teacher, String info, String courseDetail) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.info = info;
		this.courseDetail = courseDetail;
	}

	public int id;
	public String name;
	public String teacher;
	public String info;
	public String courseDetail;

}
