
public class Polimorfizm3_2 {

	private String ad;
	private String gorev;
	private int maas;
	
	public Polimorfizm3_2(String _ad, String _gorev, int _maas) {
		ad=_ad;
		gorev=_gorev;
		maas=_maas;
	}
	
	public void setAd(String x) {
		ad=x;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setGorev(String x) {
		gorev=x;
	}
	
	public String getGorev() {
		return gorev;
	}
	
	public void setMaas(int x) {
		maas=x;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void ozet() {
		System.out.println("Ad:"+ad);
		System.out.println("Gorev:"+gorev);
		System.out.println("Maas:"+maas);
	}
}
