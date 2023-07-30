import java.util.Scanner;

public class MetotTanimlama {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		MetotTanimlama metotTanimlama= new MetotTanimlama();
		
		metotTanimlama.merhaba();
		
		System.out.println("Iki adet sayi giriniz");
		int toplama=metotTanimlama.toplama(k.nextInt(), k.nextInt());
		System.out.println("Sonuc="+toplama);
		
		k.close();
		
	}
	
	public void merhaba() {
		System.out.println("Merhaba");
	}
	
	public int toplama(int x, int y) {
		int toplam = x+y;
		return toplam;
	}
}
