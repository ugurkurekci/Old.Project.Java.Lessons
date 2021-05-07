package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 4;
		int remainder = number % 2;
		boolean isPrime = true;

		System.out.println(remainder);

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				isPrime = false;
			}
		}
		if (isPrime) {

			System.out.println("Sayý Asaldýr");
		} else {
			System.out.println("Sayý Asal deðildir");
		}

	}

}
