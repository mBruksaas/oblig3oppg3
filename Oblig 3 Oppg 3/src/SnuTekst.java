import java.util.Scanner;

public class SnuTekst {

	static int a = 1;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn litt tekst: ");
		String s = input.nextLine();
		input.close();
		
		System.out.print("\"" + s + "\" baklengs er \"");
		baklengs(s);
		
		/*Unødvendig komplisering av et ellers enkelt problem
		 * System.out.println("Antall tegn: " + s.length());
		 */
	}
	
	public static void baklengs(String tekst) {
		int l = tekst.length();
		if(l != 1) {
			a++;
			System.out.print(tekst.charAt(l-1));
			baklengs(tekst.substring(0, l-1));
		} else {
			System.out.println(tekst + "\"\nAntall tegn: " + a);
		}
	}
}
