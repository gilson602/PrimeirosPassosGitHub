package curso;

import java.util.Locale; //aceitar �.� ao inv�s de �,� nas casas decimais
import java.util.Scanner;

public class Dowhile {
       public static void main(String[] args) {

              Locale.setDefault(Locale.US); //ler do teclado o �.� ao inv�s de �,�
              Scanner sc = new Scanner(System.in);

              char resp; //a vari�vel resp tem de estar aqui para ser acessada ap�s o while, devido ao escopo
              do {
                    System.out.print("Informe um n�mero: ");
                    double num = sc.nextDouble(); 
                    double sq = Math.sqrt(num);
                    System.out.println("A raiz quadrada de " + num + " � " + sq);

                    System.out.print("Deseja continuar (S ou N)? ");
                     resp = sc.next().charAt(0); //perceba que reutilizamos a vari�vel �sc� quantas vezes quisermos. Ela sempre capturar� o que digitado no teclado
               } while (resp != 'N'); //aten��o ao sinal de de diferente (!=) e �s aspas simples 
              System.out.println("Fim da execu��o!!!");
       
             sc.close();  //encerrando a vari�vel Scanner
        }
}
