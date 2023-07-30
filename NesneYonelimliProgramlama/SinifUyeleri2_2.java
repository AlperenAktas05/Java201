
public class SinifUyeleri2_2 {
	
	int saglik=100;
	static int oyuncuSayisi=0;  //static değerin hep korunmasına yol açtı
	
	public SinifUyeleri2_2() {
		oyuncuSayisi++;
	}
	
	public void oyuncuSayisi() {
		System.out.println(oyuncuSayisi);
	}
	
	public void yasam() {
		saglik=100;
	}
	
	public void darbe() {
		saglik--;
	}
}
