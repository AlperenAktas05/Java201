
public class AnonimSiniflar1_2 {

	private int agirlik;
	
	public AnonimSiniflar1_2(int agirlik) {
		this.agirlik=agirlik;
	}
	
	public void setAgirlik(int agirlik) {
		this.agirlik=agirlik;
	}
	
	public int getAgirlik() {
		return agirlik;
	}
	
	@Override
	public String toString() {
		return "Agirlik:"+getAgirlik();
	}
}
