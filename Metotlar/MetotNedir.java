import java.util.Scanner;

public class MetotNedir {
	public static void main(String[] args) {  //baslangic metodu
		
		System.out.println("Merhaba dünya");
		
		System.out.println(Math.pow(2, 3));  //Math sinifinin pow metodu
		System.out.println(Math.sqrt(16));  //Math sinifinin sqrt metodu
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Bir mesaj giriniz");
		String mesaj=k.next();  //Scanner sinifinin next metodu
		
		System.out.println(mesaj.toUpperCase());  //String sinifinin toUpperCase metodu
		
		k.close();
	}
}
