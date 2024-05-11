
public class MetotlarLab {
	
	private static int x=20;
	
	public static void main(String[] args) {
		
		MetotlarLab metotlarLab= new MetotlarLab();
		
		metotlarLab.normalMetod();  //normal metotlar class tanımlaması ister
		
		staticMetod();  //static metotlar direkt çağırılabilir
		
		int enBuyuk=enBuyuk(10,30,20);
		System.out.println("En buyuk eleman="+enBuyuk);
		
		double enBuyukDouble=enBuyuk(1.0,2.0,3.0);
		System.out.println("En buyuk double eleman="+enBuyukDouble);
	}
	
	public void normalMetod() {
		System.out.println(x);  //x direkt kullanılabilir
	}
	
	public static void staticMetod() {
		System.out.println(x);  //x sadece static olunca çağırılabilir
	}
	
	public static int enBuyuk(int x, int y, int z) {
		int enb=x;
		
		if(y>enb) {
			enb=y;
		}
		
		if(z>enb) {
			enb=z;
		}
		
		return enb;
	}
	
	public static double enBuyuk(double x, double y, double z) {
		double enb=x;
		
		if(y>enb) {
			enb=y;
		}
		
		if(z>enb) {
			enb=z;
		}
		
		return enb;
	}
}
