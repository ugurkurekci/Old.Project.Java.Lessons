package Service;

import Entities.User;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "başarılı kaydedildi");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			Add(user);
		}
	}
	public void addCourses(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getCourses()+"  kurs kaydedildi.");
		
	}
}
