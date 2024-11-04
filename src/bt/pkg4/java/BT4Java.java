
package bt.pkg4.java;

import java.util.Scanner;
public class BT4Java {

    
    public static void main(String[] args) {
         int chan = 0;
        int le = 0;
        for(int i = 1; i <= 100 ; i ++){
            if(i % 2 == 0){
                chan += i;
            } else{
                le += i;
            }
        }
        System.out.println("Tong so chan la "+chan);
        System.out.println("Tong so le la "+le);
    }
    
}
