
public class Polimorfizm2_3 extends Polimorfizm2_2{

	private int kenar;
	
	public Polimorfizm2_3(int x) {
		kenar=x;
	}
	
	public void setKenar(int x) {
		kenar=x;
	}
	
	public int getKenar() {
		return kenar;
	}
	
	public void alan() {
		System.out.println("Alan:"+kenar*kenar);
	}
}
