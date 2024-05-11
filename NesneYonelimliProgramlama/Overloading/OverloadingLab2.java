
public class OverloadingLab2 {

	public static void main(String[] args) {
		
		OverloadingLab2_2 overloadingLab2_2=new OverloadingLab2_2("1", "Alperen");
		System.out.println(overloadingLab2_2.toString());
		
		OverloadingLab2_2 overloadingLab2_2_2=new OverloadingLab2_2("1", "Mert");
		System.out.println(overloadingLab2_2_2.toString());
		
		System.out.println(overloadingLab2_2==overloadingLab2_2_2);
		System.out.println(overloadingLab2_2.equals(overloadingLab2_2_2));
	}
}
//toString metotunu kendi isteğimiz şekilde değiştirdik

// standart equals metotunu kendimize göre değiştirdik
// artık iki kisinin tc'si ayniysa her zaman bu iki kisi aynidir ve true verecektir