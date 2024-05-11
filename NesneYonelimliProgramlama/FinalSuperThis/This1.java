import java.util.Date;

public class This1 {

	public static void main(String[] args) {
		
		This1_2 this1_2=new This1_2("Alperen",8500,new Date());
		/*this1_2.setAd("Alperen");
		this1_2.setMaas(8500);
		this1_2.setTarih(new Date());*/
		
		this1_2.bilgi();
	}
}

//this kelimesi private değişkeni atama yaparken karışıklık olmaması için kullanılır
//aynı zamanda zincirleme constructorlar yapılabilir