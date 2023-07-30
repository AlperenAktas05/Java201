
public class SinifUyeleri1 {

	public static void main(String[] args) {
		
		SinifUyeleri1_2 sinifUyeleri1_2=new SinifUyeleri1_2();
		
		sinifUyeleri1_2.vites=24;
		sinifUyeleri1_2.hiz=40;
		SinifUyeleri1_2.bisikletSayisi=SinifUyeleri1_2.bisikletSayisi+1;
		
		System.out.println(sinifUyeleri1_2.vites);
		System.out.println(sinifUyeleri1_2.hiz);
		System.out.println(SinifUyeleri1_2.bisikletSayisi);
		
		//--------------------------------------------------//
		
		SinifUyeleri1_2 sinifUyeleri1_2_2=new SinifUyeleri1_2();
		
		sinifUyeleri1_2_2.vites=16;
		sinifUyeleri1_2_2.hiz=30;
		SinifUyeleri1_2.bisikletSayisi=SinifUyeleri1_2.bisikletSayisi+1;
		
		System.out.println(sinifUyeleri1_2_2.vites);
		System.out.println(sinifUyeleri1_2_2.hiz);
		System.out.println(SinifUyeleri1_2.bisikletSayisi);
	}
}
// Normal değişkenler her yeni soyutlamada yeni değerler alırken static değişkenler hep aynı kalır.
// Zaten static değişkenler direkt class ismi ile çağırılır.