
public class SinifveObjeler1 {

	public static void main(String[] args) {
		
		SinifveObjeler1_2 sinifveObjeler1_2= new SinifveObjeler1_2();  //soyutlama
		
		sinifveObjeler1_2.x=10;  //başka classtaki değişkenlere değer verme
		sinifveObjeler1_2.y=20;
		sinifveObjeler1_2.r=5;
		
		System.out.println(sinifveObjeler1_2.x);  //başka classtaki değişkenleri yazma
		System.out.println(sinifveObjeler1_2.y);
		System.out.println(sinifveObjeler1_2.r);
		
		System.out.println(sinifveObjeler1_2.cevre());  //başka classtaki metodları yazma
		System.out.println(sinifveObjeler1_2.alan());
		
		//---------------------------------------------//
		
		SinifveObjeler1_2 sinifveObjeler1_2_2= new SinifveObjeler1_2();  //aynı classa başka bir soyutlama
		sinifveObjeler1_2_2.r=10;
		
		System.out.println(sinifveObjeler1_2_2.cevre());
		System.out.println(sinifveObjeler1_2_2.alan());
		
		//-------------------------------------------------//
		
		SinifveObjeler1_2 sinifveObjeler1_2_3;
		sinifveObjeler1_2_3=sinifveObjeler1_2_2; //iki soyutlamayı eşitleme
		sinifveObjeler1_2_3.r=30;
		
		System.out.println(sinifveObjeler1_2_3.r);
		System.out.println(sinifveObjeler1_2_2.r);  //soyutlama referans tip olduğu için r kalıcı değişti
	}
}
