import java.util.Date;

public class OverloadingLab1 {

	public static void main(String[] args) {
		
		OverloadingLab1_2 overloadingLab1_2=new OverloadingLab1_2();
		overloadingLab1_2.bilgi();
		
		OverloadingLab1_2 overloadingLab1_2_2=new OverloadingLab1_2("CENG");
		overloadingLab1_2_2.bilgi();
		
		OverloadingLab1_2 overloading1_2_3=new OverloadingLab1_2("CENG","Alperen");
		overloading1_2_3.bilgi();
		
		OverloadingLab1_2 overloadingLab1_2_4=new OverloadingLab1_2("CENG", "Alperen", new Date());
		overloadingLab1_2_4.bilgi();
	}
}
