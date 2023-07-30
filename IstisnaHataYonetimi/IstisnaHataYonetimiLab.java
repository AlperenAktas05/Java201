import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IstisnaHataYonetimiLab {

	public static void main(String[] args) {
		yaz();
		oku();
	}
	
	public static void yaz() {
		Scanner k=new Scanner(System.in);
		
		File dosya=new File("dosya1.txt");
		
		try {
			PrintWriter pw=new PrintWriter(dosya);
			
			System.out.println("Bir mesaj giriniz");
			String mesaj=k.nextLine();
			
			pw.print(mesaj);
			pw.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		k.close();
	}
	
	public static void oku() {
		File dosya =new File("dosya1.txt");
		
		try {
			Scanner sc=new Scanner(dosya);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
