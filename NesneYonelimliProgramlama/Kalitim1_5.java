
public class Kalitim1_5 extends Kalitim1_2{

	private int r;
	
	public void setR(int x) {
		r=x;
	}
	
	public int getR() {
		return r;
	}
	
	public void alanHesapla() {
		System.out.println("Alan:"+(Math.PI*r*r));
	}
}
