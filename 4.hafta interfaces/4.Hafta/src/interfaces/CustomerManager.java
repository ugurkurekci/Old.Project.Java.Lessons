package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	public void Add(Customer customer) {			
		System.out.println("Müþteri eklendi: " + customer.getFirstName());	
		Utils.runLoggers(loggers, customer.getFirstName());

		}
	
	public void Delete(Customer customer) {
		System.out.println("Müþteri Silindi"+ customer.getFirstName() );
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
}
