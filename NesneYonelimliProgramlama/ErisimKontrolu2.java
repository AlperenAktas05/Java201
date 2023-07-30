import ErisimKontrolu2Paketi.ErisimKontrolu2_2;  //import ile başka paketlere erişim sağlarız

public class ErisimKontrolu2 {
	
	public static void main(String[] args) {
		
		ErisimKontrolu2_2 erisimKontrolu2_2=new ErisimKontrolu2_2();
		erisimKontrolu2_2.araba="Fiat";  //araba değişkenini çağırmamız için public olması gerekir
		System.out.println(erisimKontrolu2_2.araba);
	}
}
