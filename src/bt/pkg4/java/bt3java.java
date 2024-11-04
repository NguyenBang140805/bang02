
package bt.pkg4.java;
import java.util.Scanner;
public class bt3java {
      public static void main(String[] args) {
        System.out.println("so nguyen to tu 1 den 100:" );

        for (int i = 2; i <= 100; i++) {
            if (KTsoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean KTsoNguyenTo(int num) {
        if(num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++ ){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    } 
}
