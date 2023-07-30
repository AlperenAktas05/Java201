
public class SinifLab1_2 {
	
	String marka;
	String tip;
	boolean doldurulabilir;
	boolean silinebilir;
	
	public void yaz(String metin) {
		System.out.println(metin);
	}
	
	public void doldur() {
		if(doldurulabilir) {
			System.out.println("Kalem dolduruldu");
		}else {
			System.out.println("Bu kalem doldurulamaz");
		}
	}
	
	public void sil() {
		if(silinebilir) {
			System.out.println("Yazi silindi");
		}else {
			System.out.println("Bu yazi silinemez");
		}
	}
}
