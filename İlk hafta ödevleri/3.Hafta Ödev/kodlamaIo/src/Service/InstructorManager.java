package Service;

import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void aboutAdded(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " " + "hakkimda b�l�m� ba�ar�yla eklendi");

	}
}
