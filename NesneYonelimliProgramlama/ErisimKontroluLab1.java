import java.util.Date;

public class ErisimKontroluLab1 {

	public static void main(String[] args) {
		
		ErisimKontroluLab1_2 erisimKontrolLab1_2=new ErisimKontroluLab1_2();
		
		erisimKontrolLab1_2.setAd("Alperen");
		erisimKontrolLab1_2.setMaas(8500);
		erisimKontrolLab1_2.setBaslangicTarihi(new Date());
		
		System.out.println(erisimKontrolLab1_2.getAd());
		System.out.println(erisimKontrolLab1_2.getMaas());
		System.out.println(erisimKontrolLab1_2.getBaslangicTarihi());
	}
}

//Bu ornekte Date sinifini ogrendik ve get-set metodlarını kullandık