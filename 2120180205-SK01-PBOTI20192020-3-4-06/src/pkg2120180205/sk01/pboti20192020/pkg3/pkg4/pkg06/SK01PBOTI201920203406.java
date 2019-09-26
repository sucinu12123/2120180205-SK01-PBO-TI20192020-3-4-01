
package pkg2120180205.sk01.pboti20192020.pkg3.pkg4.pkg06;

import java.util.Scanner;

public class SK01PBOTI201920203406 {


    public static void main(String[] args) {

      Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i <= tinggi; i++) {
             for (int j = tinggi; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= (2*i - 1); j++) {
                 System.out.print("6");
                 
             }
             System.out.println("");
        }
         for (int i = 2; i <= tinggi; i++) {
             for (int j = 1; j < i; j++) {
                 System.out.print(" ");
             }
             for (int j = tinggi; j >= (2*i - tinggi); j--) {
                 System.out.print("6");
                 
             }
             System.out.println("");
        }
    }
}
