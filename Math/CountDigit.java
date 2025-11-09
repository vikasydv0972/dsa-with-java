package Math;

public class CountDigit {
    public static void main(String[] args) {
    int n= 25894;
    int count =0;
    while(n>0){
        int lastDigit=n %10;
        count++;
        n=n/10;


    }
    System.out.println(count);
        
    }

}
