
public class Polimorfizm2_5 extends Polimorfizm2_2{

	private int kisaKenar;
	private int uzunKenar;
	
	public Polimorfizm2_5(int x, int y) {
		kisaKenar=x;
		uzunKenar=y;
	}
	
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
	
	public void alan() {
		System.out.println("Alan:"+kisaKenar*uzunKenar);
	}
}
