
public abstract class SoyutSiniflar1_2 {

	private String ad;
	private int numara;
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setNumara(int numara) {
		this.numara=numara;
	}
	
	public int getNumara() {
		return numara;
	}
	
	public abstract void sutCek();
	
	public abstract void pasVer();
}
