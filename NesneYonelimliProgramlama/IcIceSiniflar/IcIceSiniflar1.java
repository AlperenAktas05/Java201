
public class IcIceSiniflar1 {

	public static void main(String[] args) {
		
		IcIceSiniflar1_2 iceSiniflar1_2=new IcIceSiniflar1_2();
		iceSiniflar1_2.setMarka("Fiat");
		iceSiniflar1_2.setYil(2013);
		
		IcIceSiniflar1_2.Motor motor=iceSiniflar1_2.new Motor();
		motor.setHacim(1300);
		iceSiniflar1_2.setMotor(motor);
		
		System.out.println(iceSiniflar1_2.getMarka());
		System.out.println(iceSiniflar1_2.getYil());
		System.out.println(iceSiniflar1_2.getMotor().getHacim());
	}
}
