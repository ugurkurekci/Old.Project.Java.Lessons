package Service;

import Entities.Student;

public class StudentManager extends UserManager {

	public void homeworkAdded(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "yorum gönderildi");
	}

}
