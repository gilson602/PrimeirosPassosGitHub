package curso;

import java.util.Scanner;

public class Maiorsemfuncao {

	public static void main(String[] args) {
        System.out.print("entre com 3 números: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();         
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b   &&  a > c) {
               System.out.println("Maior: = " + a);
        }
        else if (b > c) {
                System.out.println("Maior: = " + b);        
         }
        else {
                System.out.println("Maior: = " + c);
        }

        sc.close();

	}

}
