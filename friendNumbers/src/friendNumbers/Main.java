package friendNumbers;

public class Main {

	public static void main(String[] args) {
		// arkadaş sayılar,bir sayının kendisi hariç pozitif bölenlerinin toplamı 
		// diğer sayıya eşit ve o eşit olan sayının pbs sayı toplamı da baştaki sayıya eşitse
				// bu iki sayı arkadaş sayıdır.

				int friendOne = 200;
				int friendTwo = 284;
				int totalOne = 0;
				int totalTwo = 0;

				for (int i = 1; i < friendOne; i++) {
					if (friendOne % i == 0) {
						totalOne += i;
					}

				}
				for (int i = 1; i < friendTwo; i++) {
					if (friendTwo % i == 0) {
						totalTwo += i;
					}
				}

				if (totalOne == friendTwo && totalTwo == friendOne) {
					System.out.println(friendOne + " ve " + friendTwo + " sayıları arkadaş sayılardır.");
				}else {
					System.out.println(friendOne + " ve " + friendTwo + " sayıları arkadaş sayı değiller.");

				}
	}

}
