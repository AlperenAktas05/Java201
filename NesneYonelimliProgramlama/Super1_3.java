
public class Super1_3 extends Super1_2{

	private int numara;
	
	public Super1_3(String _ad, int _numara) {
		super(_ad);
		numara=_numara;
	}
	
	public void setNumara(int _numara) {
		numara=_numara;
	}
	
	public int getNumara() {
		return numara;
	}
	
	public void ogrenciBilgi() {
		super.kisiBilgi();
		System.out.println("Ogrenci numara:"+numara);
	}
}
