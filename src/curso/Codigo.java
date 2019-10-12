package curso;

import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int idade = sc.nextInt();  //capturando a idade
         sc.nextLine();      // essa linha �consumir� a linha na mem�ria do teclado (nextLine = toda a linha)
         String nome = sc.nextLine();    //capturando o nome
         char genero = sc.next().charAt(0); //capturando o g�nero (charAt (0) = pegar o 1� caractere)

         //Capturando um c�digo (ex.: B5) e separando em CHAR (B) e um INTEIRO (5)
         String s = sc.next();   //captura o c�digo inteiro: B5 e armazena em �s� (next = at� o espa�o em brando)
         char letra = s.charAt(0);  //captura o 1� caractere do c�digo (B).
         int digito = Integer.parseInt(s.substring(1));  // pega o 2� caractere do c�digo (5) e converte para inteiro.

         System.out.println(idade);
         System.out.println(nome);
         System.out.println(genero);

         System.out.println ("C�digo: "+ s);
         System.out.println (letra);
         System.out.println (digito);
         
         sc.close();
    }
}
