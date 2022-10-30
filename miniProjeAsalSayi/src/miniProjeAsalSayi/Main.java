package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		int remainder = number % 2; // % : mod operatörü,bölümden kalanı verir.
		int asal = 0;

		for (int i = 1; i <= number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				asal++;
			}
		}
		if (asal == 2) {
			System.out.println(number + " bir asal sayıdır");
		} else {
			System.out.println(number + " bir asal sayı değildir");
		}

		System.out.println("----------------------------------------------");

		boolean isPrime = true; // asal

		if (number == 1) {
			System.out.println(number + "asal sayı değildir");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Bir asal sayıdır");
		} else {
			System.out.println("Bir asal sayı değildir");
		}
	}

}
