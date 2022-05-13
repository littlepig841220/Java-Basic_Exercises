package CBS;

import java.io.IOException;
import java.util.Scanner;

public class Declare_Variable {
	final static float pi = 3.14f;
	private static int r = 10;
	private static int enter1 = 0;
	static float ans = 0;
	public static void main(String[] args) {
		byte a = 10; //byte:-127~128
		short b = 10; //short:-32768~32767
		int c = 10;
		long d = 10l;
		
		float e = 0.8f;
		double f = 0.8d;
		
		boolean g = false;
		
		char h = 'x';
		char h2 = '\u0058'; //use Unicode
		
		System.out.println("h=" + h);
		System.out.println("h2=" + h2);
		
		char h3 = '@';
		char h4 = '\u0040';
		char h5 = 64; //use ASCII
		
		System.out.println("h3=" + h3);
		System.out.println("h4=" + h4);
		System.out.println("h5=" + h5);
		
		ans = pi * r;
		
		System.out.println("ans=" + ans);
		
		String S1 = "Chen ";
		String S2 = "Bor-Shen";
		
		System.out.println(S1 + S2);
		System.out.println(g?S1:S2);
		
		/*System.out.println("Please enter a number:");
		try {
			enter1 = System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("You enter is " + (char)enter1 + "\nIt's ASCII is " + enter1);*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String S3 = scanner.nextLine();
		System.out.println("You enter is " + S3);
	}
}
