package curso;

import java.util.Scanner;

public class Inteiros {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Quantos números inteiros deseja informar: ");
              int n = sc.nextInt(); 

              int soma = 0;
              for (int i = 1; i <= n ; i++) {
                      System.out.printf("Digite o " + i + "º número: ");
                      int num = sc.nextInt();  //num é uma variável local de ‘for’
                      soma += num;  // a variável soma vai somando o valor dela com o do num
               }
              System.out.println("Soma dos números informados: " + soma);
       
             sc.close();
        }
}
