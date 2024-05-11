import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		int list[]= {1,2,3,4,5};
		
		System.out.println("Hangi elemani istiyorsunuz?");
		int eleman=k.nextInt();
		
		if(0<eleman && eleman<list.length) {
			System.out.println(list[eleman-1]);
		}else {
			System.out.println("Yanlis deger girildi!");
		}
		
		/*try {
			System.out.println("Hangi elemani istiyorsunuz?");
			eleman=k.nextInt();
			
			System.out.println(list[eleman-1]);
		}catch(IndexOutOfBoundsException exc) {
			System.out.println("Yanlis deger girildi!");
		}*/
		
		k.close();
	}
}
// kisa kontrollerde if-else blogu try-cath bloklarindan daha hizlidir