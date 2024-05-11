
public class ErisimKontrolu3 {

	public static void main(String[] args) {
		
		ErisimKontrolu3_2 erisimKontrolu3_2=new ErisimKontrolu3_2();
		
		erisimKontrolu3_2.numara=1;
		erisimKontrolu3_2.ad="Alperen";
		erisimKontrolu3_2.soyad="Aktas";
		erisimKontrolu3_2.setYas(-19);
		
		erisimKontrolu3_2.bilgi();
	}
}
 // eğer bir değişkenin değerini kontrol altına almak istiyorsak o değişkeni private yapmalıyız
// private değere public bir metod ile ulaşıp if-else yapıları ile şart oluşturabiliriz 
// bu olaya encapsulation denir