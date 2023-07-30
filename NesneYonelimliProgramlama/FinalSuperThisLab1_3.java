
public class FinalSuperThisLab1_3 extends FinalSuperThisLab1_2{

	private int yolcuKapasitesi;
	
	public FinalSuperThisLab1_3(String plaka, String marka, int kapasite) {
		super(plaka,marka);
		this.yolcuKapasitesi=kapasite;
	}
	
	public void setKapasite(int kapasite) {
		this.yolcuKapasitesi=kapasite;
	}
	
	public int getKapasite() {
		return yolcuKapasitesi;
	}
	
	public void bilgi() {
		super.bilgi();
		System.out.println("Yolcu kapasitesi:"+yolcuKapasitesi);
	}
}
