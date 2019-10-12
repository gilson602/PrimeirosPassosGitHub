package curso;

public class TabelaAscii {

	public static void main(String[] args) {
		char c;
		
		System.out.println("NÚMEROS (códigos 48 a 57:)");
		for (int i = 48; i <= 57; i++) {
			c = (char) i;

			System.out.print(c + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("LETRAS MAIÚSCULAS (códigos 65 a 90:):");
		for (int i = 65; i <= 90; i++) {
			c = (char) i;

			System.out.print(c + " ");
		}
		
		System.out.println("\n");		
		System.out.println("letras minúsculas (códigos 97 a 122:):");
		for (int i = 97; i <= 122; i++) {
			c = (char) i;

			System.out.print(c + " ");
		}
		
	}

}