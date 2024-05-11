
public class MetotAdlandirmalari {
	public static void main(String[] args) {
		
		MetotAdlandirmalari metotAdlandirmalari=new MetotAdlandirmalari();
		
		metotAdlandirmalari.helloWorld();
		
		System.out.println(metotAdlandirmalari.toplam(3, 5));
	}
	
	private void helloWorld() {
		System.out.println("Merhaba Dunya");
	}
	
	private int toplam(int sayi1, int sayi2) {
		int toplam=sayi1+sayi2;
		
		return toplam;
	}
}

//normal metotlar static metotların icerisinde çağırılamazlar. Bu yüzden class tanımlaması yapılır.
//private metotlar sadece kendi class'ında çalışır.
//aynı isimde farklı metotlar oluşturulamazlar.
//void metotlar geriye bir değer döndürmezler.
//geri döndürülecek değerler için metodun veri tipi yazılmalıdır.
//metodun kullanacağı parametreler parantez içinde tanımlanmalıdır.