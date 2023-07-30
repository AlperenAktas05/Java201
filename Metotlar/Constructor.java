
public class Constructor {

	public static void main(String[] args) {
		
		Constructor2 constructor2=new Constructor2("Alperen","Aktas",19);
		System.out.println(constructor2.ad);
		System.out.println(constructor2.soyad);
		System.out.println(constructor2.yas);
		
		Constructor2 constructor2_2=new Constructor2();
		System.out.println(constructor2_2.ad);
		System.out.println(constructor2_2.soyad);
		System.out.println(constructor2_2.yas);
		
	}
}
