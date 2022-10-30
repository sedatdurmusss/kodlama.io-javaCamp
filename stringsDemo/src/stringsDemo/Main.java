package stringsDemo;

public class Main {

	public static void main(String[] args) {
		// string özellik ve fonksiyonları
				String mesaj = "Bugün hava çok güzel.";
				System.out.println(mesaj);

				// eleman sayısı
				System.out.println("Eleman sayısı : " + mesaj.length());
				// n. karakteri getirme
				System.out.println("5. eleman: " + mesaj.charAt(4));
				// stringleri birleştirme
				System.out.println(mesaj.concat("Yaşasın!"));
				// Başladığı harf'e göre boolean bi sonuç döner. (B ile başlıyor mu, true)
				System.out.println(mesaj.startsWith("B"));
				// Bittiği karakter'e göre boolean sonuç döner (. ile bitiyor mu)
				System.out.println(mesaj.endsWith(".")); 

				// getChars(); -> belirli bir karakter dizisi/string te başlangıç ve bitiş
				// belirtilerek ve aktarılacağı hedef char dizisini belirtip kaçıncı dizinden
				// itibaren yapıştırılacağını belirtip o kısmı alabilir yazdırabiliriz.
				char[] karakterler = new char[5];
				mesaj.getChars(0, 5, karakterler, 0);// mesaj stringinde 0. indeksten itibaren 4 index getir.(5. index saymaz yani
												// toplamda 0 1 2 3 4 olarak beş index getirir)karakterlere 0.index ten itibaren ata
												
				System.out.println(karakterler);
				// indexOf : karakter veya string girerek aranan değerin kaçıncı indexte olduğunu döndürür. karakteri bulduğu ilk index i döner.
				System.out.println(mesaj.indexOf('a'));
				System.out.println(mesaj.indexOf("av"));
				//lastindexOf : indexof un tersine sondan arama yapar,ama baştan index i döndürür
				
				
				//replace değiştirmek istediğimiz karakteri ve yerine yazılacak karakteri beliritiriz
				System.out.println(mesaj.replace(" ","-")); //boşluk yerine '-' koyduk
				//substring : stringi belirli bi yerden itibaren almak için,başlangıç index i belirtiriz
				System.out.println(mesaj.substring(2)); //2 den itibaren
				
				System.out.println(mesaj.substring(2,4)); //2 den 4 e kadar,4 dahil değil
				
				//split : herhangi karaktere göre böler stringi,örneğin bi cümleyi kelimelere ayırmak istyorsak boşluk belirtilmeli
				// bize dizi döndüğü içinde foreach ile yazdırabiliriz
				
				for (String kelime : mesaj.split(" ")) {
					System.out.println(kelime);
				}
				
				System.out.println(mesaj.toLowerCase()); //tüm harfler küçük
				System.out.println(mesaj.toUpperCase()); //tüm harfler büyük
				System.out.println(mesaj.trim()); //başındaki ve sonundaki boşlukları siler

	}

}
