package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel: Geçtiniz");
			break;
		case 'C':
			System.out.println("Güzel: Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil: Geçtiniz");
			break;
		case 'E':
			System.out.println("Geçer Not Deðil: Kaldýnýz");
			break;
		default:

			System.out.println("GEÇERLÝ HARF GÝRÝNÝZ");

		}

	}

}
