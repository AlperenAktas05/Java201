import java.util.Arrays;

public class MetotParametreleri {

	public static void main(String[] args) {
		
		MetotParametreleri metotParametreleri=new MetotParametreleri();
		
		int x=20;  //ilkel tipler belleğin ön kısmında yer alır
		System.out.println(x);
		metotParametreleri.degistir(x);  //x=10 oldu
		System.out.println(x);  //x ilk değerini korudu
		
		int y[]= {1,2,3,4,5,6};  //referans tipler belleğin arka kısmında yer alır
		System.out.println(Arrays.toString(y));
		metotParametreleri.diziDegistir(y);  //y elemanları 2 katına çıktı
		System.out.println(Arrays.toString(y));  //ilk değerini korumadı
	}
	
	public void degistir(int x) {  
		System.out.println("Metod="+x);
		x=10;
		System.out.println("Metod="+x);
	}
	
	public void diziDegistir(int y[]) {
		
		for(int i=0; i<y.length; i++) {
			y[i]=y[i]*2;
		}
	}
}

//ilkel tiplerin değeri değiştirdikleri zaman yeni bir kopyaya atanır. Bu nedenle ilk değerini korur
//referans tiplerin değeri değiştiğinde direkt referans tip değişir. Bu nedenle ilk değerini korumaz.