
public class FinalSuperThisLab1_6 extends FinalSuperThisLab1_4{
	
	private int dorse;
	
	public FinalSuperThisLab1_6(String plaka, String marka, int yukKapasitesi, int dorse) {
		super(plaka, marka, yukKapasitesi);
		this.dorse=dorse;
	}
	
	public void setDorse(int dorse) {
		this.dorse=dorse;
	}
	
	public int getDorse() {
		return dorse;
	}
	
	public void bilgi() {
		super.bilgi();
		System.out.println("Dorse sayisi:"+dorse);
	}
}
