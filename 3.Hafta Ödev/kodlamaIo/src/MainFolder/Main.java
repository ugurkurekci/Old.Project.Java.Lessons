package MainFolder;

import Entities.Instructor;
import Entities.Student;
import Entities.User;
import Service.InstructorManager;
import Service.StudentManager;
import Service.UserManager;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ugur");
		student.setLastName("Kurekci");
		student.setEmail("mail@mail.com");
		student.setPassword("123");
		student.setCourses("Java");
		student.setComment("Java 3. hafta ödevi tamamlandı.");

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setId(1);
		instructor.setEmail("mail@mail.com");
		instructor.setPassword("123");
		instructor.setImage("img....");
		instructor.setAbout("Sertifikalarım var, her yerde çalıştım.");
		instructor.setCourses("tarafından Java kursu yüklendi");
		
		
		User[]users= {student,instructor};
		UserManager manager=new UserManager();
		manager.addMultiple(users);
		manager.addCourses(instructor);
		manager.Add(student);
		
		InstructorManager manager2= new InstructorManager();
		manager2.aboutAdded(instructor);
		
		StudentManager manager3= new StudentManager();
		manager3.homeworkAdded(student);

	}

}
