
public class MetotParametreleriLab {

	public static void main(String[] args) {
		
		MetotParametreleriLab2 metotParametreleriLab2=new MetotParametreleriLab2();
		metotParametreleriLab2.isim="Alperen";
		metotParametreleriLab2.yas=19;
		
		MetotParametreleriLab metotParametreleriLab=new MetotParametreleriLab();
		metotParametreleriLab.bilgiler(metotParametreleriLab2);
		
		System.out.println(metotParametreleriLab2.isim);
		System.out.println(metotParametreleriLab2.yas);
	}
	
	public void bilgiler(MetotParametreleriLab2 metotParametreleriLab2) {
		
		metotParametreleriLab2.isim="Mert";
		
		System.out.println(metotParametreleriLab2.isim);
		System.out.println(metotParametreleriLab2.yas);
	}
}

//classlarda birer referan tiptir ve dizilerde olduğu gibi değişey değerler kalıcıdır.