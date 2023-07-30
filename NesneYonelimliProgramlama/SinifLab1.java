
public class SinifLab1 {

	public static void main(String[] args) {
		
		SinifLab1_2 sinifLab1_2=new SinifLab1_2();
		
		sinifLab1_2.marka="Faber Castel";
		sinifLab1_2.tip="Kursun Kalem";
		sinifLab1_2.doldurulabilir=false;
		sinifLab1_2.silinebilir=true;
		
		sinifLab1_2.yaz("Alperen Aktas");
		sinifLab1_2.doldur();;
		sinifLab1_2.sil();
		
		SinifLab1_2 sinifLab1_2_2=new SinifLab1_2();
		
		sinifLab1_2_2.marka="Adel";
		sinifLab1_2_2.tip="Pilot Kalem";
		sinifLab1_2_2.doldurulabilir=true;
		sinifLab1_2_2.silinebilir=false;
		
		sinifLab1_2_2.yaz("Selen Aktas");
		sinifLab1_2_2.doldur();
		sinifLab1_2_2.sil();
	}
}
