package Recursions;
public class Print1 {
    static int count=0;
    public static void print1(){
        
        if(count==5){
            return;
        }
        else{
        System.out.println(1);
        count++;
        print1();
        
        }
    }

    public static void main(String[] args) {
        print1();      
    }
}
