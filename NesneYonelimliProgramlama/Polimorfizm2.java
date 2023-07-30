
public class Polimorfizm2 {

	public static void main(String[] args) {
		
		Polimorfizm2_2 polimorfizm2_2=new Polimorfizm2_2();  //standart
		polimorfizm2_2.alan();
		
		Polimorfizm2_3 polimorfizm2_3=new Polimorfizm2_3(10);  //standart
		polimorfizm2_3.alan();
		
		Polimorfizm2_4 polimorfizm2_4=new Polimorfizm2_4(5);  //standart
		polimorfizm2_4.alan();
		
		Polimorfizm2_5 polimorfizm2_5=new Polimorfizm2_5(5, 10);  //standart
		polimorfizm2_5.alan();
		
		//-------------------------------------------------------//
		
		Polimorfizm2_2 polimorfizm2_2_2=new Polimorfizm2_3(20);  //polimorfizm
		polimorfizm2_2_2.alan();
	}
}
