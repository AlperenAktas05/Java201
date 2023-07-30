
public class IcIceSiniflar1_2 {

	private String marka;
	private int yil;
	private Motor motor;
	
	public void setMarka(String marka) {
		this.marka=marka;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setYil(int yil) {
		this.yil=yil;
	}
	
	public int getYil() {
		return yil;
	}
	
	public void setMotor(Motor motor) {
		this.motor=motor;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public class Motor{
		
		private int hacim;
		
		public void setHacim(int hacim) {
			this.hacim=hacim;
		}
		
		public int getHacim() {
			return hacim;
		}
	}
}
