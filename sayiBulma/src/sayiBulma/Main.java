package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int numberFind=8;
		boolean flag= false;
		
		for (int i : sayilar) {
			if (numberFind == i) {
				flag=true;
				break; //döngüyü bitir
			}
		}
		if (flag) {
			System.out.println("Sayı bulundu");
		}else {
			System.out.println("Sayı bulunamadı");
		}
	}

}
