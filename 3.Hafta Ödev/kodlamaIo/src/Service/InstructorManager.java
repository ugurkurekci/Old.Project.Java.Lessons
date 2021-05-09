package Service;

import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void aboutAdded(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " " + "hakkimda bölümü baþarýyla eklendi");

	}
}
