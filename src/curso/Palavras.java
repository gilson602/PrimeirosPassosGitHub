package curso;

import java.util.Scanner;

public class Palavras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
	    System.out.printf("A frase digitada foi: %s %n", frase);
	    System.out.printf("Primeira palavra: %s %n", x);
	    System.out.printf("Segunda palavra: %s %n", y);
	    System.out.printf("Terceira palavra: %s %n", z);
	    sc.close();
	}

}
