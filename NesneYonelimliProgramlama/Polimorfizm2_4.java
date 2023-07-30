
public class Polimorfizm2_4 extends Polimorfizm2_2{

	private int r;
	
	public Polimorfizm2_4(int x) {
		r=x;
	}
	
	public void setR(int x) {
		r=x;
	}
	
	public int getR() {
		return r;
	}
	
	public void alan() {
		System.out.println("Alan:"+Math.PI*r*r);
	}
}
