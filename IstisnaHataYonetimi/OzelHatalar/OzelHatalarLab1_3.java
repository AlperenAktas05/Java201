
public class OzelHatalarLab1_3 extends RuntimeException{

	public OzelHatalarLab1_3(String degisken, Object deger) {
		super(degisken+", "+deger+" olamaz!");
	}
}
