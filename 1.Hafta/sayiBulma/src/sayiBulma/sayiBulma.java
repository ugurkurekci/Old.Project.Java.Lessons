package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayý Vardýr");
		} else {
			System.out.println("Sayý Yoktur");
		}
	}

}
