
public class StaticMetotTanimlama {
	
	public static void main(String[] args) {
		
		Merhaba();
		
		MetotTanimlama2.toplama(0, 0);  
		MetotTanimlama2.cikarma(0, 0);
		MetotTanimlama2.carpma(0, 0);
		MetotTanimlama2.bolme(0, 0);
	}
	
	public static void Merhaba() {
		System.out.println("Merhaba");
	}
}

//static metotlar diğer static metotlarda direkt çağırılabilirler.