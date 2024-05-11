
public class SinifUyeleri2 {

	public static void main(String[] args) {
		
		SinifUyeleri2_2 sinifUyeleri2_2=new SinifUyeleri2_2();
		
		System.out.println("Saglik="+sinifUyeleri2_2.saglik);
		
		for(int i=0; i<30; i++) {
			sinifUyeleri2_2.darbe();
			System.out.println("Saglik="+sinifUyeleri2_2.saglik);
		}
		
		System.out.println("Yasam basiliyor...");
		sinifUyeleri2_2.yasam();
		System.out.println("Saglik="+sinifUyeleri2_2.saglik);
		
		SinifUyeleri2_2 sinifUyeleri2_2_2=new SinifUyeleri2_2();
		SinifUyeleri2_2 sinifUyeleri2_2_3=new SinifUyeleri2_2();
		SinifUyeleri2_2 sinifUyeleri2_2_4=new SinifUyeleri2_2();
		SinifUyeleri2_2 sinifUyeleri2_2_5=new SinifUyeleri2_2();
		SinifUyeleri2_2 sinifUyeleri2_2_6=new SinifUyeleri2_2();
		
		sinifUyeleri2_2_6.oyuncuSayisi();
	}
}
