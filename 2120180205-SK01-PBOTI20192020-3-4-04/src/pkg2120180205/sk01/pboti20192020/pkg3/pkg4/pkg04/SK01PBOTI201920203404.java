
package pkg2120180205.sk01.pboti20192020.pkg3.pkg4.pkg04;


public class SK01PBOTI201920203404 {


public static void main(String[] args) {
        
        int x,y,z,a;
        for (x = 1; x <= 9; x++){
            for (y = 8; y >= x; y--){
                System.out.print(" ");
            }
            for (z = 1; z<= x; z++){
                System.out.print("4");
            }
            for (a = 1; a<= x - 1; a++){
                System.out.print("4");
            }
            System.out.println();
        }
    }
}

