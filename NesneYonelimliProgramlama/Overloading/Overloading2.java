
public class Overloading2 {

	public static void main(String[] args) {
		
		Overloading2_2 overloading2_2=new Overloading2_2("Fiat","Linea",2013);
		System.out.println(overloading2_2.toString());
	}
}
//varolan bir metot ismiyle başka bir metot oluşturursak kendi oluşturduğumuz metot çalışır
//yani öncelik sırası kendi metotlarımızdır.