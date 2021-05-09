package interitance2;

public class LogManager {
	public void Log(int logType) {
		if (logType == 1) {
			System.out.println("Veritabanýna loglandý.");
		} else if (logType == 2) {
			System.out.println("Dosyaya loglandý");
		} else {
			System.out.println("Email gönderildi.");
		}

	}

}

//1 - DATABASE
//2 - File
//3 - Email