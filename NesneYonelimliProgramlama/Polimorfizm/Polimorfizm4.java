
public class Polimorfizm4 {

	public static void main(String[] args) {
		
		Polimorfizm4_2 polimorfizm4_2=new Polimorfizm4_2();
		polimorfizm4_2.cal();
		polimorfizm4_2.akorYap();
		
		Polimorfizm4_3 polimorfizm4_3=new Polimorfizm4_3();
		polimorfizm4_3.cal();
		polimorfizm4_3.akorYap();
		
		Polimorfizm4_4 polimorfizm4_4=new Polimorfizm4_4();
		polimorfizm4_4.cal();
		polimorfizm4_4.akorYap();
		
		//--------------------------//
		
		Polimorfizm4_2 polimorfizm4_2_2=new Polimorfizm4_3();  //Polimorfizm
		polimorfizm4_2_2.cal();
		polimorfizm4_2_2.akorYap();
	}
}
