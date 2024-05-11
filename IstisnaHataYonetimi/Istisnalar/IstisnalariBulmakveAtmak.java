
public class IstisnalariBulmakveAtmak {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=0;
		
		try {
			System.out.println(sayi1/sayi2);
		}catch(Exception exc) {
			System.out.println(exc.getMessage());
			throw exc;
		}finally {
			System.out.println("Uygulama bitti");
		}
	}
}
//finally anahtar kelimesi uygulama crash verse bile çalışır