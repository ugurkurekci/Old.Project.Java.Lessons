package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel: Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok G�zel: Ge�tiniz");
			break;
		case 'C':
			System.out.println("G�zel: Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il: Ge�tiniz");
			break;
		case 'E':
			System.out.println("Ge�er Not De�il: Kald�n�z");
			break;
		default:

			System.out.println("GE�ERL� HARF G�R�N�Z");

		}

	}

}
