
public class OzelHatalarLab1_2 {

	private String ad;
	private double maas;
	
	public void setAd(String ad) {
		if(ad==null || ad.trim().length()==0) {
			throw new OzelHatalarLab1_3("Ad",ad);
		}else {
			this.ad=ad;
		}
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setMaas(double maas) {
		if(maas<0) {
			throw new OzelHatalarLab1_3("Maas", maas);
		}else {
			this.maas=maas;
		}
	}
	
	public double getMaas() {
		return maas;
	}
	
	@Override
	public String toString() {
		return "Ad:"+ad+" Maas:"+maas;
	}
}
