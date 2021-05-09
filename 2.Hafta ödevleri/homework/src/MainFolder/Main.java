package MainFolder;

import Entities.Course;
import Service.CourseManager;
import Entities.Category;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(1, "Engin Demirog", "Yazılım Gelistirme Danismani",
				"Cesitli sertifikasyonlara sahip kıymetli biri",
				"Java");
		Course course2 = new Course(2, "Engin Demirog", "Yazılım Gelistirme Danismani",
				"Cesitli sertifikasyonlara sahip kıymetli biri",
				"C#");
		Course course3 = new Course(3, "Engin Demirog", "Yazılım Gelistirme Danismani",
				"Cesitli sertifikasyonlara sahip kıymetli biri",
				"Angular/React");
		
		Course[] courses= {course1,course2,course3};
		System.out.println("Courses: ");
		
		for (Course course : courses) {
			System.out.println(course.teacher);
		}
		
		Category category1= new Category();
		category1.id=1;
		category1.name= "Kurslar";
		
		Category category2= new Category();
		category2.id=2;
		category2.name= "Eğitmenler";
		
		Category category3= new Category();
		category3.id=1;
		category3.name= "Ayarlar";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.register(course2);
		courseManager.register(course3);
		

	}

}
