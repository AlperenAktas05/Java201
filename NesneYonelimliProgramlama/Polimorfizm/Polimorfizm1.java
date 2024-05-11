
public class Polimorfizm1 {

	public static void main(String[] args) {
		
		Polimorfizm1_2 polimorfizm1_2=new Polimorfizm1_2();  //Standart
		polimorfizm1_2.ses();
		
		Polimorfizm1_3 polimorfizm1_3=new Polimorfizm1_3();  //Standart
		polimorfizm1_3.ses();
		
		Polimorfizm1_4 polimorfizm1_4=new Polimorfizm1_4();  //Standart
		polimorfizm1_4.ses();
		
		Polimorfizm1_5 polimorfizm1_5=new Polimorfizm1_5();  //Standart
		polimorfizm1_5.ses();
		
		//-------------------------------------------------//
		
		Polimorfizm1_2 polimorfizm1_2_2=new Polimorfizm1_3();  //Polimorfizm
		polimorfizm1_2_2.ses();
	}
}

//Polimorfizm ata class'ın miras class'tan newlendiği yapıdır.
// Artık ata class miras classın metotlarını kullanır
