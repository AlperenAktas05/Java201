
public class Overloading1 {

	public static void main(String[] args) {
		
		Overloading1_2 overloading1_2=new Overloading1_2();
		
		System.out.println(overloading1_2.topla(1, 1));
		System.out.println(overloading1_2.topla(1.0, 1.0));
		System.out.println(overloading1_2.topla(1.0, 1));
		System.out.println(overloading1_2.topla(1, 1.0));
		
		Overloading1_3 overloading1_3=new Overloading1_3("Alperen","Aktas","1","A");
		System.out.println(overloading1_3.getAd());
		System.out.println(overloading1_3.getSoyad());
		System.out.println(overloading1_3.getKimlik());
		System.out.println(overloading1_3.getSinif());
	}
}

//metot imzaları tipine ismine ve parametresine göre değişiklilik gösterir
//aynı durum constructorlar için de geçerlidir. Farklı parametleli constructorlar olabilir