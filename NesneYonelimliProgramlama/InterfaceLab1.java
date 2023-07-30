
public class InterfaceLab1 {

	public static void main(String[] args) {
		
		InterfaceLab1_2[] interfaceLab1_2=new InterfaceLab1_2[10];
		interfaceLab1_2[0]=new InterfaceLab1_2("Sari", 10);
		interfaceLab1_2[1]=new InterfaceLab1_2("Kirmizi", 20);
		interfaceLab1_2[2]=new InterfaceLab1_2("Yesil", 30);
		interfaceLab1_2[3]=new InterfaceLab1_2("Sari", 20);
		interfaceLab1_2[4]=new InterfaceLab1_2("Kirmizi", 10);
		interfaceLab1_2[5]=new InterfaceLab1_2("Yesil", 10);
		interfaceLab1_2[6]=new InterfaceLab1_2("Sari", 10);
		interfaceLab1_2[7]=new InterfaceLab1_2("Kirmizi", 30);
		interfaceLab1_2[8]=new InterfaceLab1_2("Yesil", 20);
		interfaceLab1_2[9]=new InterfaceLab1_2("Sari", 30);
		
		/*renkFiltre("Yesil", interfaceLab1_2);
		System.out.println("-----------------");
		kucuk(15, interfaceLab1_2);
		System.out.println("-----------------");
		buyuk(15, interfaceLab1_2);*/
		
		InterfaceLab1_4 interfaceLab1_4=new InterfaceLab1_4();
		filtre(interfaceLab1_4, interfaceLab1_2);
	}
	
	public static void filtre(InterfaceLab1_3 interfaceLab1_3, InterfaceLab1_2[] interfaceLab1_2) {
		
		for(int i=0; i<interfaceLab1_2.length; i++) {
			InterfaceLab1_2 interfaceLab1_2_2=interfaceLab1_2[i];
			if(interfaceLab1_3.filtre(interfaceLab1_2_2)) {
				System.out.println(interfaceLab1_2_2.getRenk()+" "+interfaceLab1_2_2.getAgirlik());
			}
		}
	}
	
	/*public static void renkFiltre(String renk,InterfaceLab1_2[] interfaceLab1_2) {
		
		for(int i=0; i<interfaceLab1_2.length; i++) {
			InterfaceLab1_2 interfaceLab1_2_2=interfaceLab1_2[i];
			if(interfaceLab1_2_2.getRenk().equals(renk)) {
				System.out.println(interfaceLab1_2_2.getRenk()+" "+interfaceLab1_2_2.getAgirlik());
			}
		}
	}
	
	public static void kucuk(int agirlik, InterfaceLab1_2[] interfaceLab1_2) {
		
		for(int i=0; i<interfaceLab1_2.length; i++) {
			InterfaceLab1_2 interfaceLab1_2_2=interfaceLab1_2[i];
			if(interfaceLab1_2_2.getAgirlik()<=agirlik) {
				System.out.println(interfaceLab1_2_2.getRenk()+" "+interfaceLab1_2_2.getAgirlik());
			}
		}
	}
	
	public static void buyuk(int agirlik, InterfaceLab1_2[] interfaceLab1_2) {
		
		for(int i=0; i<interfaceLab1_2.length; i++) {
			InterfaceLab1_2 interfaceLab1_2_2=interfaceLab1_2[i];
			if(interfaceLab1_2_2.getAgirlik()>=agirlik) {
				System.out.println(interfaceLab1_2_2.getRenk()+" "+interfaceLab1_2_2.getAgirlik());
			}
		}
	}*/
}

//yesil kodlar normal fitreleme
//normal kodlar interface filtreleme