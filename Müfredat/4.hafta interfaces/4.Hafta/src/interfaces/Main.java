package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EmailLogger(),new FileLogger(),new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer ugur= new Customer(1," Ugur","Kurekci"); 
		customerManager.Add(ugur);

	}

}
