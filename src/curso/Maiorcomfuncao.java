package curso;

import java.util.Scanner;

public class Maiorcomfuncao {

     public static void main(String[] args){
           System.out.print("entre com 3 números: ");
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();         
           int b = sc.nextInt();
           int c = sc.nextInt();
 
           int maximo = max(a, b, c);

           showResultado(maximo);

           sc.close();
      }

      public static int max(int x, int y, int z) {
            int aux;
            if (x > y  && x > z)  {
                   aux = x;
            }
            else if (y > z) {
                     aux = y;
            }
            else {
                     aux = z;
            }
            return aux;
       }   
       public static void showResultado(int w) {
            System.out.print("Maior número digitado " + w);
       }
}
