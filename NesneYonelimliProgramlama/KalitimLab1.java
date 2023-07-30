
public class KalitimLab1 {

	public static void main(String[] args) {
		
		KalitimLab1_2 kalitimLab1_2=new KalitimLab1_2();
		kalitimLab1_2.setAd("Selen");
		System.out.println(kalitimLab1_2.getAd());
		
		KalitimLab1_3 kalitimLab1_3=new KalitimLab1_3();
		kalitimLab1_3.setAd("Eren");
		kalitimLab1_3.setDers("Turkce");
		System.out.println(kalitimLab1_3.getAd());
		System.out.println(kalitimLab1_3.getDers());

		KalitimLab1_4 kalitimLab1_4=new KalitimLab1_4();
		kalitimLab1_4.setAd("Alperen");
		kalitimLab1_4.setDers("Algoritma");
		kalitimLab1_4.setKampus("Ana Kampus");
		System.out.println(kalitimLab1_4.getAd());
		System.out.println(kalitimLab1_4.getDers());
		System.out.println(kalitimLab1_4.getKampus());
		
		KalitimLab1_5 kalitimLab1_5=new KalitimLab1_5();
		kalitimLab1_5.setAd("Nurgul");
		kalitimLab1_5.setOkul("Besir Balcioglu Anadolu Lisesi");
		System.out.println(kalitimLab1_5.getAd());
		System.out.println(kalitimLab1_5.getOkul());
		
		KalitimLab1_6 kalitimLab1_6=new KalitimLab1_6();
		kalitimLab1_6.setAd("Ali Vefa");
		kalitimLab1_6.setBrans("Beyin Cerrahisi");
		System.out.println(kalitimLab1_6.getAd());
		System.out.println(kalitimLab1_6.getBrans());
	}
}

//tekli kalitim ornegi
//hiyerarsi kalitim ornegi
//Java coklu kalitim'a izin vermez. C++ dilinde mevcuttur.
