import java.util.Date;

public class OverloadingLab1_2 {

	private String bolum;
	private String ad;
	private Date tarih;
	
	public OverloadingLab1_2() {
		
	}
	
	public OverloadingLab1_2(String bolum) {
		this.bolum=bolum;
	}
	
	public OverloadingLab1_2(String bolum, String ad) {
		this.bolum=bolum;
		this.ad=ad;
	}
	
	public OverloadingLab1_2(String bolum, String ad, Date tarih) {
		this.bolum=bolum;
		this.ad=ad;
		this.tarih=tarih;
	}
	
	public void setBolum(String bolum) {
		this.bolum=bolum;
	}
	
	public String getBolum() {
		return bolum;
	}
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setTarih(Date tarih) {
		this.tarih=tarih;
	}
	
	public Date getTarih() {
		return tarih;
	}
	
	public void bilgi() {
		System.out.println("Bolum:"+getBolum());
		System.out.println("Ad:"+getAd());
		System.out.println("Ise Baslama Tarihi:"+getTarih());
		System.out.println("-------------------");
	}
}
