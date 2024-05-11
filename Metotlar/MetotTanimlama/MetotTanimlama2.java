import java.util.Scanner;

public class MetotTanimlama2 {
	
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		MetotTanimlama2 metotTanimlama2= new MetotTanimlama2();
		
		System.out.println("Merhaba, islem seciniz: +,-,*,/");
		String islem=k.next();
		
		if(islem.equals("+")) {
			System.out.println("Iki adet sayi giriniz:");
			System.out.println("Sonuc="+metotTanimlama2.toplama(k.nextDouble(), k.nextDouble()));
		}
		
		if(islem.equals("-")) {
			System.out.println("Iki adet sayi giriniz:");
			System.out.println("Sonuc="+metotTanimlama2.cikarma(k.nextDouble(), k.nextDouble()));
		}
		
		if(islem.equals("*")) {
			System.out.println("Iki adet sayi giriniz:");
			System.out.println("Sonuc="+metotTanimlama2.carpma(k.nextDouble(), k.nextDouble()));
		}
		
		if(islem.equals("/")) {
			System.out.println("Iki adet sayi giriniz:");
			System.out.println("Sonuc="+metotTanimlama2.bolme(k.nextDouble(), k.nextDouble()));
		}
		
		k.close();
	}
	
	public static double toplama(double x, double y) {
		return x+y;
	}
	
	public static double cikarma(double x, double y) {
		return x-y;
	}
	
	public static double carpma(double x, double y) {
		return x*y;
	}
	
	public static double bolme(double x, double y) {
		return x/y;
	}
	
	public static double kare(double x) {
		return Math.pow(x, 2);
	}
	
	public static double karekok(double x) {
		return Math.sqrt(x);
	}
}
