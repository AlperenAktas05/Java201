
public /*final*/ class Final1_2 {

	private final int sayi;
	
	public Final1_2(int _sayi) {
		sayi=_sayi;
	}
	
	public int getSayi() {
		return sayi;
	}
	
	public /*final*/ void yaz() {
		System.out.println("Sayi yazildi");
	}
}

//final kelimesi ile değişkenlerin değiştirilmesi engellenir. Sadece constructor ile ilk değeri verilir.
//final kelimesi ile classlar miras alınamaz
//final kelimesi ile ayni metottan 2 tane yazılamaz.