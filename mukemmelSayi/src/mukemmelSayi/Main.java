package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int pozitifBolen = 0;
		
		if (number < 2) {
			System.out.println("Mükemmel bir sayı değildir.");
			return;
		}
		
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				pozitifBolen += i;
			}
		}
		if (pozitifBolen == number) {
			System.out.println(number + " sayısı bir mükemmel sayıdır");
		} else {
			System.out.println(number + " sayısı bir mükemmel sayı değildir");
		}

	}

}
