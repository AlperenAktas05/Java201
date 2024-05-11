
public class SoyutSiniflar1 {

	public static void main(String[] args) {
		
		SoyutSiniflar1_2 soyutSiniflar1_2=new SoyutSiniflar1_3();
		soyutSiniflar1_2.setAd("Lionel Messi");
		soyutSiniflar1_2.setNumara(10);
		System.out.println(soyutSiniflar1_2.getAd());
		System.out.println(soyutSiniflar1_2.getNumara());
		
		soyutSiniflar1_2.pasVer();
		soyutSiniflar1_2.sutCek();
	}
}

//abstract metotlar kullanılmak için degildir. Amacı miras metotlarında kullanılmaktır
//abstract metot kullanmak için class'ın da abstract olması gerekmektedir.
//abstract metotların gövdesi olmaz
//Miras class'ta bu metotlar aynı isimle oluşturulup istenilen kodlar yazılır.
//abstract classlar'a sadece polimorfizm yolu ile ulaşılır