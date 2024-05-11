
public class Super1_2 {

	private String ad;
	
	public Super1_2(String _ad) {
		ad=_ad;
	}
	
	public void setAd(String _ad) {
		ad=_ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void kisiBilgi() {
		System.out.println("Kisi:"+ad);
	}
}

//super kelimesi miras classtan ata class'ın constructor'ına parametre göndermeye yarar
//super kelimesi ile ata class'ın metotlarını miras class'ta kullanabiliriz 