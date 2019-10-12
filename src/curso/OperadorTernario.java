package curso;

public class OperadorTernario {

	public static void main(String[] args) {
		double preco = 250.0;
		double desconto;
		
		desconto = (preco < 200.0) ? preco * 0.1 : preco * 0.05;

		System.out.println("Valor do desconto: " + desconto);
	}

}
