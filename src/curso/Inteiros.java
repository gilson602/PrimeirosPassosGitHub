package curso;

import java.util.Scanner;

public class Inteiros {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Quantos n�meros inteiros deseja informar: ");
              int n = sc.nextInt(); 

              int soma = 0;
              for (int i = 1; i <= n ; i++) {
                      System.out.printf("Digite o " + i + "� n�mero: ");
                      int num = sc.nextInt();  //num � uma vari�vel local de �for�
                      soma += num;  // a vari�vel soma vai somando o valor dela com o do num
               }
              System.out.println("Soma dos n�meros informados: " + soma);
       
             sc.close();
        }
}
