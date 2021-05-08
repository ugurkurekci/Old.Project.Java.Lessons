package conditionals;

public class conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 40;
		int sayi2 = 30;
		String kücük = "Sayi1, Sayi2'den küçüktür.";
		String büyük = "Sayi1, Sayi2'den büyüktür.";
		String esit = "Sayi1 ve Sayi2 eþittir.";

		if (sayi1 < sayi2) {

			System.out.println(kücük);

		} else if (sayi1 > sayi2) {
			System.out.println(büyük);

		} else {
			System.out.println(esit);
		}

	}

}
