import java.util.Arrays;

public class MetotlarLab2 {

	public static void main(String[] args) {
		
		boolean trueFalse=trueFalse(true,false,false);
		System.out.println(trueFalse);
		
		int x[]= {1,2,3,4,5};
		int y[]= {1,2,3,4,6};	
		boolean ayniDizi=ayniDizi(x,y);
		System.out.println(ayniDizi);
		
		int küp=küp(3);
		System.out.println(küp);
		
		int z[]= {1,2,3,4,5};
		int toplam=toplam(z);
		System.out.println(toplam);
		
		int ciftSayilar[]= ciftSayilar(new int[]{1,2,3,4,5,6,7,8,9,10});
		System.out.println(Arrays.toString(ciftSayilar));
	}
	
	public static boolean trueFalse(boolean x, boolean y, boolean z) {
		return (x && y) || (x && z) || (y&&z);
	}
	
	public static boolean ayniDizi(int x[], int y[]) {  //dizilerin aynı olduğunu kontrol etme
		boolean kontrol=true;
		
		if(x.length==y.length) {
			
			for(int i=0; i<x.length; i++) {
				
				if(x[i]!=y[i]) {
					kontrol=false;
					break;
				}
			}
		}
		
		return kontrol;
	}
	
	public static int küp(int x) {
		return x*x*x;
	}
	
	public static int toplam(int x[]) {
		int top=0;
		
		for(int i=0; i<x.length; i++) {
			top=top+x[i];
			
		}
		
		return top;
	}
	
	public static int[] ciftSayilar(int x[]) {
		int adet=0;
		
		for(int i=0; i<x.length; i++) {
			if(x[i]%2==0) {
				adet++;
			}
		}
		
		int cift[]=new int[adet];
		int sayac=0;
		
		for(int i=0; i<x.length; i++) {
			if(x[i]%2==0) {
				cift[sayac++]=x[i];
			}
		}
		
		return cift;
	}
}
