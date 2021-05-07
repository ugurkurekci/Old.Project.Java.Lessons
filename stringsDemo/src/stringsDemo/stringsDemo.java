package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		System.out.println("Eleman Sayýsý : " + mesaj.length());
		System.out.println("5.Eleman Sayýsý : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('g'));
		System.out.println(mesaj.lastIndexOf('g'));

		System.out.println(mesaj.replace(" ", " - "));
		System.out.println(mesaj);
	}

}
