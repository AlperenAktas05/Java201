
public class InterfaceLab1_2 {

	private String renk;
	private int agirlik;
	
	public InterfaceLab1_2(String renk, int agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	
	public void setRenk(String renk) {
		this.renk=renk;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setAgirlik(int agirlik) {
		this.agirlik=agirlik;
	}
	
	public int getAgirlik() {
		return agirlik;
	}
}
