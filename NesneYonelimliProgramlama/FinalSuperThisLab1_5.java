
public class FinalSuperThisLab1_5 extends FinalSuperThisLab1_3{

	private int kapi;
	
	public FinalSuperThisLab1_5(String plaka, String marka, int kapasite, int kapi) {
		super(plaka, marka, kapasite);
		this.kapi=kapi;
	}
	
	public void setKapi(int kapi) {
		this.kapi=kapi;
	}
	
	public int getKapi() {
		return kapi;
	}
	
	public void bilgi() {
		super.bilgi();
		System.out.println("Kapi sayisi:"+kapi);
	}
}
