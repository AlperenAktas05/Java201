
public class OverloadingLab2_2 {

	private String tc;
	private String ad;
	
	public OverloadingLab2_2(String tc, String ad) {
		this.tc=tc;
		this.ad=ad;
	}
	
	public void setTc(String tc) {
		this.tc=tc;
	}
	
	public String getTc() {
		return tc;
	}
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	@Override
	public String toString() {
		return "TC:"+getTc()+" Ad:"+getAd();
	}
	
	@Override
	public boolean equals(Object other) {
		OverloadingLab2_2 overloadingLab2_2=(OverloadingLab2_2) other;
		return overloadingLab2_2.tc.equals(this.tc);
	}
}
