/*Et enkelt program som ved rekursjon snur
 * rekkefølgen på en string som blir tastet inn. */

import java.util.Scanner;

public class SnuTekst {
	static int a = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn litt tekst: ");
		String s = input.nextLine();
		input.close();
		
		System.out.print("\"" + s + "\" baklengs er \"");
		baklengs(s);
		
		/*
		 * Unødvendig komplisering av et ellers enkelt problem (oppg1del2)
		 * System.out.println("Antall tegn: " + s.length());
		 */
	}
	
	public static void baklengs (String tekst) {
		baklengs(tekst, tekst.length()-1);
	}
	
	public static void baklengs(String tekst, int siste) {
		if(siste != -1) {
			a++;
			System.out.print(tekst.charAt(siste));
			baklengs(tekst, siste-1);
		} else {
			System.out.println("\"\nAntall tegn: " + a);
		}
	}
}
