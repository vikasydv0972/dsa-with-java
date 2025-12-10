package Recursions;

public class Print1ToN {

    static void print1ToN(int i, int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            i++;
            print1ToN(i, n);
        }

    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        print1ToN(i,n);
        
    }
    
}
