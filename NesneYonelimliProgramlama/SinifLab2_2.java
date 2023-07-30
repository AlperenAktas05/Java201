
public class SinifLab2_2 {
	
	SinifLab2_3 tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobilVeri;
	boolean aramaVarmi;
	
	public void aramaYap(String numara) {
		System.out.println(numara+" araniyor...");
		aramaVarmi=true;
	}
	
	public void aramaSonlandir() {
		if(aramaVarmi) {
			System.out.println("Arama sonlandirildi");
		}else {
			System.out.println("Zaten aramada degilsiniz");
		}
	}
	
	public void mesajGonder(String mesaj) {
		if(wifi || mobilVeri) {
			System.out.println("Mesaj gonderildi");
		}else {
			System.out.println("Lutfen wifi ya da mobil veri kullaniniz");
		}
	}
}
