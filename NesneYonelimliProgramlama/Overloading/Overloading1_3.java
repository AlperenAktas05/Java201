
public class Overloading1_3 {

	private String ad;
	private String soyad;
	private String kimlik;
	private String sinif;
	
	public Overloading1_3() {
		
	}
	
	public Overloading1_3(String ad) {
		this.ad=ad;
	}
	
	public Overloading1_3(String ad, String soyad) {
		this.ad=ad;
		this.soyad=soyad;
	}
	
	public Overloading1_3(String ad, String soyad, String kimlik) {
		this.ad=ad;
		this.soyad=soyad;
		this.kimlik=kimlik;
	}
	
	public Overloading1_3(String ad, String soyad, String kimlik, String sinif) {
		this.ad=ad;
		this.soyad=soyad;
		this.kimlik=kimlik;
		this.sinif=sinif;
	}
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad=soyad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setKimlik(String kimlik) {
		this.kimlik=kimlik;
	}
	
	public String getKimlik() {
		return kimlik;
	}
	
	public void setSinif(String sinif) {
		this.sinif=sinif;
	}
	
	public String getSinif() {
		return sinif;
	}
}
