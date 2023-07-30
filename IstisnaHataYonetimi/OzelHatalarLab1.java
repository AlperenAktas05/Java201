
public class OzelHatalarLab1 {

	public static void main(String[] args) {
		
		OzelHatalarLab1_2 hatalarLab1_2=new OzelHatalarLab1_2();
		
		try {
			hatalarLab1_2.setAd("  ");
		}catch(OzelHatalarLab1_3 exc) {
			System.out.println(exc.getMessage());
		}
		
		try {
			hatalarLab1_2.setMaas(-8500);
		}catch(OzelHatalarLab1_3 exc) {
			System.out.println(exc.getMessage());
		}
		
		System.out.println(hatalarLab1_2.toString());
		
	}
}
