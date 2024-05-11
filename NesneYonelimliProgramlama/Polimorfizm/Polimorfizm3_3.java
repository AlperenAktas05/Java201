
public class Polimorfizm3_3 extends Polimorfizm3_2{

	private String birim;
	
	public Polimorfizm3_3(String _ad, String _gorev, int _maas, String _birim) {
		super(_ad,_gorev,_maas);
		birim=_birim;
	}
		
	public void ozet() {
		System.out.println("Memur Ad:"+getAd());
		System.out.println("Memur Gorev:"+getGorev());
		System.out.println("Memur Maas:"+getMaas());
		System.out.println("Memur Birim:"+birim);
	}
}
