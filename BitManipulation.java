import java.util.*;

public class BitManipulation{
    // Check if a number is odd or even
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask ) == 0) {
            //even
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }

    // get ith bit 
    public static int getIthbit(int n, int i){
        int bitmask = 1>>i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    // set ith bit 
     public static int setIthbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
     }
        //clear ith bitmask
     public static int clearithbit(int n, int i){
         int bitmask = ~(i<<i);
         return n & bitmask;
     }

    public static int clearIbits(int n, int i){
        int bitmask = (~0) <<i;
        return n & bitmask;
    }

    public static void main(String args[]) {
        // oddEven(4);
        // oddEven(10);
        // System.out.println(getIthbit(8,3));
        //  System.out.println(setIthbit(10,2));
        //  System.out.println(clearithbit(10,1));
        // System.out.println(clearIbits(15,2));
       System.out.println(5^5);
        
      
    }
}