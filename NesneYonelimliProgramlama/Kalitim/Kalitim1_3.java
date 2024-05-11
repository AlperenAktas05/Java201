
public class Kalitim1_3 extends Kalitim1_2{  //Kalitim1_2'nin metotlarını kullanabiliriz

	private int kenar;
	
	public void setKenar(int a) {
		kenar=a;
	}
	
	public int getKenar() {
		return kenar;
	}
	
	public void alanHesapla() {
		System.out.println("Alan:"+(kenar*kenar));
	}
}
