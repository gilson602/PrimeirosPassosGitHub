package curso;

import java.util.Locale;
import java.util.Scanner;

public class maria {
	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        String nome = sc.next();  //capturando a primeira palavra (MARIA)
        char genero = sc.next().charAt(0);  //capturando o próximo caractere ‘F’ de ‘feminino’
        int idade = sc.nextInt();  //capturando o próximo inteiro (23)
        double altura = sc.nextDouble();  //capturando o próximo Double (1.68)

        System.out.println(nome);
        System.out.println(genero);
        System.out.println(idade);
        System.out.println(altura);

        sc.close();
   }

}
