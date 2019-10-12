package curso;

import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int idade = sc.nextInt();  //capturando a idade
         sc.nextLine();      // essa linha ‘consumirá’ a linha na memória do teclado (nextLine = toda a linha)
         String nome = sc.nextLine();    //capturando o nome
         char genero = sc.next().charAt(0); //capturando o gênero (charAt (0) = pegar o 1º caractere)

         //Capturando um código (ex.: B5) e separando em CHAR (B) e um INTEIRO (5)
         String s = sc.next();   //captura o código inteiro: B5 e armazena em ‘s’ (next = até o espaço em brando)
         char letra = s.charAt(0);  //captura o 1º caractere do código (B).
         int digito = Integer.parseInt(s.substring(1));  // pega o 2º caractere do código (5) e converte para inteiro.

         System.out.println(idade);
         System.out.println(nome);
         System.out.println(genero);

         System.out.println ("Código: "+ s);
         System.out.println (letra);
         System.out.println (digito);
         
         sc.close();
    }
}
