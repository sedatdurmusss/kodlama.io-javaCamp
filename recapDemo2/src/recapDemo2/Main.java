package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,2.4,3.8};
		double total=0;
		double max= myList[0];
		
		for (double number : myList) {
			if (max<number) {
				max = number;
			}
			System.out.println(number);
			total += number;
		}
		System.out.println("En büyük sayı :" + max);
		System.out.println("Sayıların Toplamı :" +total);

	}

}
