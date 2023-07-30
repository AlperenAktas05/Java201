
public class MetotlarLab3 {

	public static void main(String[] args) {
		degistir(3, 5);
	}
	
	public static void degistir(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println(x);
		System.out.println(y);
	}
}
