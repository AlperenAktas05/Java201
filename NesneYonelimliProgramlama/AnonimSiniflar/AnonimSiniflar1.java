import java.util.Arrays;
import java.util.Comparator;

public class AnonimSiniflar1 {

	public static void main(String[] args) {
		
		AnonimSiniflar1_2[] anonimSiniflar1_2= {
				new AnonimSiniflar1_2(10),
				new AnonimSiniflar1_2(30),
				new AnonimSiniflar1_2(20),
				new AnonimSiniflar1_2(40)
		};
		
		System.out.println(Arrays.toString(anonimSiniflar1_2));
		
		Arrays.sort(anonimSiniflar1_2,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				AnonimSiniflar1_2 anonimSiniflar1_2_2=(AnonimSiniflar1_2) o1;
				AnonimSiniflar1_2 anonimSiniflar1_2_3=(AnonimSiniflar1_2) o2;
				return anonimSiniflar1_2_2.getAgirlik()-anonimSiniflar1_2_3.getAgirlik();
			}
		});
		
		System.out.println(Arrays.toString(anonimSiniflar1_2));
	}
}
//anonim sınıflar bir class dizisinin sıralamasını yaparken ek bir class oluşturmaya gerek kalmadan
//geçici bir metot çağırır