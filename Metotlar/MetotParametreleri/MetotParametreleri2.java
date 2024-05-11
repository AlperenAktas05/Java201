
public class MetotParametreleri2 {

	public static void main(String[] args) {
		
		MetotParametreleri2 metotParametreleri2=new MetotParametreleri2();
		
		metotParametreleri2.degistir(5);
		
		metotParametreleri2.dizi(10, 1,2);
	}
	
	public void degistir(int x) { //final kodu ile değişkenlerin değişmesini engelleyebiliriz
		x=10;
		System.out.println(x);
	}
	
	public void dizi(int y,int...x) {  //uc nokta ile dizi elemanı belirlememize gerek kalmaz
		
		int a=x[0];
		int b=x[1];
		System.out.println((a*y)+(b*y));
	}
}
