package arraysDEMO;

public class arraysDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ogrenci1 = "Uður";
		String ogrenci2 = "Engin";
		String ogrenci3 = "Yiðit";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Uður";
		ogrenciler[1] = "Engin";
		ogrenciler[2] = "Yiðit";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}
	}

}
