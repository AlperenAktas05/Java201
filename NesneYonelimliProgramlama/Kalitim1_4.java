
public class Kalitim1_4 extends Kalitim1_2{

	private int kisaKenar;
	private int uzunKenar;
	
	public void setKisaKenar(int x) {
		kisaKenar=x;
	}
	
	public int getKisaKenar() {
		return kisaKenar;
	}
	
	public void setUzunKenar(int y) {
		uzunKenar=y;
	}
	
	public int getUzunKenar() {
		return uzunKenar;
	}
	
	public void alanHesapla() {
		System.out.println("Alan:"+(kisaKenar*uzunKenar));
	}
}
