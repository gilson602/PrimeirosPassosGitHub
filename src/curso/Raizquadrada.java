package curso;

import java.util.Locale;   //para aceitar o ponto nas casas decimais
import java.util.Scanner;

public class Raizquadrada {
       public static void main(String[] args) {

              Locale.setDefault(Locale.US); //para aceitar o ponto nas casas decimais
              Scanner sc = new Scanner(System.in);

              System.out.print ("Entre com um n�mero. Se negativo, termina: ");
              double n = sc.nextDouble(); //capturando o n�mero doble digitado

              while (n >= 0.0) {     //maior ou igual a 0.0 (double com ponto e n�o v�rgula)
                      double raiz = Math.sqrt(n);
                      System.out.printf("Raiz quadrada: %.3f%n", raiz);    //exibindo e formantando a resposta
                      System.out.print("Entre com outro n�mero: ");
                      n = sc.nextDouble();
              }
              System.out.println("N�mero negativo. FIM!");
       
             sc.close();
        }
}

