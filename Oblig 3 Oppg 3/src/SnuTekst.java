import java.util.Scanner;

public class SnuTekst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn litt tekst: ");
		String s = input.nextLine();
		input.close();
		
		System.out.print("\"" + s + "\" baklengs er \"");
		baklengs(s);
	}
	
	public static void baklengs(String tekst) {
		int l = tekst.length();
		if(l != 1) {
			System.out.print(tekst.charAt(l-1));
			baklengs(tekst.substring(0, l-1));
		} else {
			System.out.println(tekst + "\"");
		}
	}
}
