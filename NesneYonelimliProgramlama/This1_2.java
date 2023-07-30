import java.util.Date;

public class This1_2 {

	private String ad;
	private double maas;
	private Date tarih;
	
	public This1_2() {
		this("Bilinmiyor");
	}
	
	public This1_2(String ad) {
		this(ad,0);
	}
	
	public This1_2(String ad, double maas) {
		this(ad,maas,null);
	}
	
	public This1_2(String ad, double maas, Date tarih) {
		this.ad=ad;
		this.maas=maas;
		this.tarih=tarih;
	}
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setMaas(int maas) {
		this.maas=maas;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setTarih(Date tarih) {
		this.tarih=tarih;
	}
	
	public Date getTarih() {
		return tarih;
	}
	
	public void bilgi() {
		System.out.println("Ad:"+ad);
		System.out.println("Maas:"+maas);
		System.out.println("Baslama tarihi:"+tarih);
	}
}
