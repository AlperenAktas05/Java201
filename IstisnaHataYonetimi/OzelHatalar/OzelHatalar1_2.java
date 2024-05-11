
public class OzelHatalar1_2 {

	private int x;
	private int y;
	private double r;
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setR(double r) {
		if(r<0) {
			throw new OzelHatalar1_3(r);
		}else {
			this.r=r;
		}
	}
	
	public double getR() {
		return r;
	}
	
	@Override
	public String toString() {
		return "X:"+x+" Y:"+y+" R:"+r;
	}
}
