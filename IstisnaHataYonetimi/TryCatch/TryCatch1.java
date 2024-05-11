import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		try {
			System.out.println("Birinci sayiyi giriniz");
			int sayi1=k.nextInt();
			System.out.println("Ikinci sayiyi giriniz");
			int sayi2=k.nextInt();
			
			System.out.println("Sonuc="+(sayi1/sayi2));
		}catch(ArithmeticException exc) {
			System.out.println(exc.getLocalizedMessage());  //isletim sisteminin diline gore hatayi yazar
			System.out.println(exc.getMessage());  //editore gore hatayi yazar
			exc.printStackTrace();  //hata ile ilgili bilgi verir		
			System.out.println("Aritmetik Hata!");  //istege bagli mesaj
		}catch(InputMismatchException exc) {
			System.out.println("Yanlis Deger Girildi!");
		}
		
		k.close();
	}
}
