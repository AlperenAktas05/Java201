
public class SinifLab2 {
	public static void main(String[] args) {
		
		SinifLab2_2 sinifLab2_2=new SinifLab2_2();
		
		sinifLab2_2.tip=SinifLab2_3.CEP;
		sinifLab2_2.marka="Xiaomi";
		sinifLab2_2.model="Redmi Note 10S";
		sinifLab2_2.wifi=true;
		sinifLab2_2.mobilVeri=true;
		
		sinifLab2_2.aramaYap("551 105 09 36");
		sinifLab2_2.aramaSonlandir();
		sinifLab2_2.mesajGonder("Merhaba, nasilsin?");
	}
}
