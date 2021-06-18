package Service;

import Entities.Course;

public class CourseManager {

	public void register(Course course) {
		System.out.println("Registered: " + course.courseDetail);
	}
}
