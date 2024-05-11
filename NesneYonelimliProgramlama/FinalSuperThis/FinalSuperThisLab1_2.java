
public class FinalSuperThisLab1_2 {

	private String plaka;
	private String marka;
	
	public FinalSuperThisLab1_2(String plaka, String marka) {
		this.plaka=plaka;
		this.marka=marka;
	}
	
	public void setPlaka(String plaka) {
		this.plaka=plaka;
	}
	
	public String getPlaka() {
		return plaka;
	}
	
	public void setMarka(String marka) {
		this.marka=marka;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void bilgi() {
		System.out.println("Plaka:"+plaka);
		System.out.println("Marka:"+marka);
	}
}
