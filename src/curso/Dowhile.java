package curso;

import java.util.Locale; //aceitar “.” ao invés de “,” nas casas decimais
import java.util.Scanner;

public class Dowhile {
       public static void main(String[] args) {

              Locale.setDefault(Locale.US); //ler do teclado o “.” ao invés de “,”
              Scanner sc = new Scanner(System.in);

              char resp; //a variável resp tem de estar aqui para ser acessada após o while, devido ao escopo
              do {
                    System.out.print("Informe um número: ");
                    double num = sc.nextDouble(); 
                    double sq = Math.sqrt(num);
                    System.out.println("A raiz quadrada de " + num + " é " + sq);

                    System.out.print("Deseja continuar (S ou N)? ");
                     resp = sc.next().charAt(0); //perceba que reutilizamos a variável “sc” quantas vezes quisermos. Ela sempre capturará o que digitado no teclado
               } while (resp != 'N'); //atenção ao sinal de de diferente (!=) e às aspas simples 
              System.out.println("Fim da execução!!!");
       
             sc.close();  //encerrando a variável Scanner
        }
}
