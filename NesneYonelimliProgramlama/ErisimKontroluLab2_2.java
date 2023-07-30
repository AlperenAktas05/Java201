
public class ErisimKontroluLab2_2 {

	private int x;
	private int y;
	private int kenar;
	
	public void setX(int a) {
		if(a>-1) {
			x=a;
		}else {
			System.out.println("X eksi deger alamaz");
		}
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int b) {
		if(b>-1) {
			y=b;
		}else {
			System.out.println("Y eksi deger alamaz");
		}
	}
	
	public int getY() {
		return y;
	}
	
	public void setKenar(int c) {
		if(c>-1) {
			kenar=c;
		}else {
			System.out.println("Kenar eksi deger alamaz");
		}
	}
	
	public int getKenar() {
		return kenar;
	}
	
	public void bilgi() {
		System.out.println("X: "+getX());
		System.out.println("Y: "+getY());
		System.out.println("Kenar: "+getKenar());
	}
}
