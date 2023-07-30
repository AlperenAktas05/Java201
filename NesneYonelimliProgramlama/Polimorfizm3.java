
public class Polimorfizm3 {

	public static void main(String[] args) {
		
		Polimorfizm3_2 polimorfizm3_2=new Polimorfizm3_2("Alperen", "CENG", 20000);
		polimorfizm3_2.ozet();
		
		Polimorfizm3_3 polimorfizm3_3=new Polimorfizm3_3("Ali Cem", "Astsubay", 20000,"Hava");
		polimorfizm3_3.ozet();
		
		//-------------------------------//
		
		Polimorfizm3_2 polimorfizm3_2_2=new Polimorfizm3_3("Mert","Sef",15000,"Parti Sefi");
		polimorfizm3_2_2.ozet();
	}
}

