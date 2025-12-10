package Recursions;

public class PrintNto1 {

    static void printNTo1( int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            
            printNTo1(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        printNTo1(n);
        
    }
}
