package interitance2;

public class LogManager {
	public void Log(int logType) {
		if (logType == 1) {
			System.out.println("Veritaban�na logland�.");
		} else if (logType == 2) {
			System.out.println("Dosyaya logland�");
		} else {
			System.out.println("Email g�nderildi.");
		}

	}

}

//1 - DATABASE
//2 - File
//3 - Email