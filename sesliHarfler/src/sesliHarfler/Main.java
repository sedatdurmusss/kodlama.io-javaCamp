package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Girilen harf kalın seslidir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Girilen harf ince seslidir.");
			break;
		default:
			System.out.println("Sesli bir harf girmediniz.");
		}

		System.out.println("---------------------------------------");

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Girilen harf kalın seslidir.");
			break;
		default:
			System.out.println("Girilen harf ince seslidir.");
		}
	}

}
