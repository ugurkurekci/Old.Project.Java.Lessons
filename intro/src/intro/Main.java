package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase(yazýmKuralý)
		//Don't repeat yourself(KendiniTekrarEtme)
		
		
		String internetSubeButonu = "Ýnternet Þubeye gir";
		double dolarDun = 7.52;
		double dolarBugun=7.52;
		boolean dustuMu= false;
		int vade = 36;
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("dolar düþtü.");
			
		}
		else if(dolarBugun>dolarDun){
			System.out.println("dolar yükseldi.");
		}
		else {
			System.out.println("eþit deðiþmedi");

		}
		
		System.out.println("------");
		
		String kredi1="Hýzlý Kredi";
		String kredi2="Emekli Kredi";
		String kredi3="Konut Kredi";
		String kredi4="Çiftçi Kredi";
		String kredi5="Msb Kredi";
		String kredi6="Meb Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		System.out.println("-----");
		
		
		String[]krediler= {
				"Hýzlý Kredi",
				"Emekli Kredi",
				"Konut Kredi",
				"Çiftçi Kredi",
				"Msb Kredi",
				"Meb Kredi"		,
				"Kültür Kredi"	
		};

		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);			
		}
		//for
		for(int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]);			
		
		}
		
		System.out.println("---------");	
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		
		System.out.println("---------");			

 
		int[]sayilar1= {1,2,3,4,5};
		int[]sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
	}   


}
