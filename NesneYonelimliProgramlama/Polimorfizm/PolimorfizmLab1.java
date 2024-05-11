import java.util.Scanner;

public class PolimorfizmLab1 {

	public static void main(String[] args) {
		
		PolimorfizmLab1_2 polimorfizmLab1_2=new PolimorfizmLab1_2();
		
		polimorfizmLab1_2.ac();
		polimorfizmLab1_2.calis("SELECT FROM STUDENTS");
		polimorfizmLab1_2.kapat();
		
		PolimorfizmLab1_3 polimorfizmLab1_3=new PolimorfizmLab1_3();
		
		polimorfizmLab1_3.ac();
		polimorfizmLab1_3.calis("SELECT FROM MYSQL STUDENTS");
		polimorfizmLab1_3.kapat();
		
		//------------------------------------------------------//
		
		PolimorfizmLab1_2 polimorfizmLab1_2_2=new PolimorfizmLab1_4();  //polimorfizm
		
		polimorfizmLab1_2_2.ac();
		polimorfizmLab1_2_2.calis("SELECT FROM MSSQL STUDENTS");
		polimorfizmLab1_2_2.kapat();
		
		//-------------------------------------------------------//
		
		Scanner k=new Scanner(System.in);
		
		PolimorfizmLab1_2 polimorfizmLab1_2_3=null;
		
		System.out.println("Lutfen bir veritabani seciniz:[1-MySQL, 2-MsSQL]");
		int secim=k.nextInt();
		
		switch(secim) {
		
		case 1:
			polimorfizmLab1_2_3=new PolimorfizmLab1_3();
			break;
			
		case 2:
			polimorfizmLab1_2_3=new PolimorfizmLab1_4();
			break;
			
			default:
				System.out.println("Yanlis deger girildi");
				break;
		}
		
		if(polimorfizmLab1_2_3!=null) {
			polimorfizmLab1_2_3.ac();
			polimorfizmLab1_2_3.calis("SELECT FROM STUDENTS");
			polimorfizmLab1_2_3.kapat();
		}
		
		k.close();
		
	}
}