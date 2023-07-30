import java.util.Scanner;

public class IstisnalariBulmak {

	public static void main(String[] args) {
		
		//aritmetikHata();
		//diziBoyutuHata();
		//nullHata();
	}
	
	public static void aritmetikHata() {
		Scanner k=new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		int sayi1=k.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int sayi2=k.nextInt();
		
		System.out.println(sayi1+"/"+sayi2+"="+(sayi1/sayi2));
		
		k.close();
	}
	
	public static void diziBoyutuHata() {
		Scanner k=new Scanner(System.in);
		
		int[] list=new int [5];
		
		for(int i=0; i<list.length; i++) {
			System.out.println((i+1)+". elemani giriniz");
			list[i]=k.nextInt();
		}
		
		System.out.println("Dizinin hangi elemanini istiyorsunuz?");
		int eleman=k.nextInt();
		
		System.out.println(list[eleman-1]);
		
		k.close();
	}
	
	public static void nullHata() {
		Scanner k=null;
		System.out.println("Bir kelime giriniz");
		String kelime=k.next();
		
		k.close();
	}
}

//Eclipse bize derleme hatalarını gösterir ama çalışma zamanı hatalarını gösteremez
//Bu durumda oluşabilecek hataları önceden öngörmemiz gerekir
//Popüler hatalar yukarıda yazılmıştır
