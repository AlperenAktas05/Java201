
public class ErisimKontrolu3_2 {

	int numara;
	String ad;
	String soyad;
	private int yas;
	
	public void setYas(int x) {
		if(x>0) {
			yas=x;
		}else {
			System.out.println("Yas 0'dan kucuk deger alamaz");
		}
	}
	
	public void bilgi() {
		System.out.println("Numara:"+numara);
		System.out.println("Ad:"+ad);
		System.out.println("Soyad:"+soyad);
		System.out.println("Yas:"+yas);
	}
}
