
public class Kalitim1 {

	public static void main(String[] args) {
		
		Kalitim1_3 kalitim1_3=new Kalitim1_3();
		
		kalitim1_3.setX(10);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_3.setY(10);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_3.setRenk("Mavi");  //kalıtım sayesinde Kalitim1_2'den geldi
		
		kalitim1_3.setKenar(15);  //kendi metotu
		kalitim1_3.alanHesapla();
		
		System.out.println("X:"+kalitim1_3.getX());
		System.out.println("Y:"+kalitim1_3.getY());
		System.out.println("Renk:"+kalitim1_3.getRenk());
		System.out.println("Kenar:"+kalitim1_3.getKenar());
		
		//--------------------------------------------------//
		
		Kalitim1_4 kalitim1_4=new Kalitim1_4();
		
		kalitim1_4.setX(20);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_4.setY(20);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_4.setRenk("Sari");  //kalıtım sayesinde Kalitim1_2'den geldi
		
		kalitim1_4.setKisaKenar(5);  //kendi metotu
		kalitim1_4.setUzunKenar(10);  //kendi metotu
		kalitim1_4.alanHesapla();
		
		System.out.println("X:"+kalitim1_4.getX());
		System.out.println("Y:"+kalitim1_4.getY());
		System.out.println("Renk:"+kalitim1_4.getRenk());
		System.out.println("Kisa Kenar:"+kalitim1_4.getKisaKenar());
		System.out.println("Uzun Kenar:"+kalitim1_4.getUzunKenar());
		
		//-------------------------------------------------------------//
		
		Kalitim1_5 kalitim1_5=new Kalitim1_5();
		
		kalitim1_5.setX(30);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_5.setY(30);  //kalıtım sayesinde Kalitim1_2'den geldi
		kalitim1_5.setRenk("Yesil");  //kalıtım sayesinde Kalitim1_2'den geldi
		
		kalitim1_5.setR(8);  //kendi metotu
		kalitim1_5.alanHesapla();
		
		System.out.println("X:"+kalitim1_5.getX());
		System.out.println("Y:"+kalitim1_5.getY());
		System.out.println("Renk:"+kalitim1_5.getRenk());
		System.out.println("Yaricap:"+kalitim1_5.getR());
	}
}
