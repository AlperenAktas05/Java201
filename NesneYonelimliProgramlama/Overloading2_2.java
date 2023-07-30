
public class Overloading2_2 {

	private String marka;
	private String model;
	private int yil;
	
	public Overloading2_2(String marka, String model, int yil) {
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
	
	public void setMarka(String marka) {
		this.marka=marka;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setYil(int yil) {
		this.yil=yil;
	}
	
	public int getYil() {
		return yil;
	}
	
	@Override
	public String toString() {
		return "Marka:"+getMarka()+" Model:"+getModel()+" Yil:"+getYil();
	}
}
