package curso;

import java.util.Locale;   //para aceitar o ponto nas casas decimais
import java.util.Scanner;

public class Raizquadrada {
       public static void main(String[] args) {

              Locale.setDefault(Locale.US); //para aceitar o ponto nas casas decimais
              Scanner sc = new Scanner(System.in);

              System.out.print ("Entre com um número. Se negativo, termina: ");
              double n = sc.nextDouble(); //capturando o número doble digitado

              while (n >= 0.0) {     //maior ou igual a 0.0 (double com ponto e não vírgula)
                      double raiz = Math.sqrt(n);
                      System.out.printf("Raiz quadrada: %.3f%n", raiz);    //exibindo e formantando a resposta
                      System.out.print("Entre com outro número: ");
                      n = sc.nextDouble();
              }
              System.out.println("Número negativo. FIM!");
       
             sc.close();
        }
}

