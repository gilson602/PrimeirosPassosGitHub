package curso;
import java.util.Scanner;

public class MeuPrimeroPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		System.out.println("Boa tade, " + nome + "!");
		sc.close();

	}

}
