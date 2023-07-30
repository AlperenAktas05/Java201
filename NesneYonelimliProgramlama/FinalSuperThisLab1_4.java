
public class FinalSuperThisLab1_4 extends FinalSuperThisLab1_2{

	private int yukKapasitesi;
	
	public FinalSuperThisLab1_4(String plaka, String marka, int yukKapasitesi) {
		super(plaka, marka);
		this.yukKapasitesi=yukKapasitesi;
	}
	
	public void setYukKapasitesi(int yukKapasitesi) {
		this.yukKapasitesi=yukKapasitesi;
	}
	
	public int getYukKapasitesi() {
		return yukKapasitesi;
	}
	
	public void bilgi() {
		super.bilgi();
		System.out.println("Yuk kapasitesi:"+yukKapasitesi);
	}
}
